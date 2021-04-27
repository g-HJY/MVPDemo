package com.skycomm.mvpdemo.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.skycomm.mvpdemo.contract.IPresenter;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by _H_JY on 2018/5/11.
 */

public abstract class BaseFragment<P extends IPresenter> extends Fragment {

    @Inject
    protected P presenter;

    private Unbinder unbinder;

    protected View rootView;

    protected BaseActivity activity;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(initLayout(), container, false);
        unbinder = ButterKnife.bind(this, rootView);
        return rootView;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        activity = (BaseActivity) getActivity();
        componentInject();
        initData();
    }

    protected abstract int initLayout();

    protected abstract void componentInject();

    protected abstract void initData();


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        if (unbinder != Unbinder.EMPTY) {
            unbinder.unbind();
        }
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        this.presenter = null;
        this.rootView = null;
        this.unbinder = null;
        this.activity = null;
    }
}
