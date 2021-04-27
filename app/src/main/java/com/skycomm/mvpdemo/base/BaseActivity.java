package com.skycomm.mvpdemo.base;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.skycomm.mvpdemo.app.App;
import com.skycomm.mvpdemo.app.AppComponent;
import com.skycomm.mvpdemo.contract.IPresenter;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by _H_JY on 2018/5/11.
 */

public abstract class BaseActivity<P extends IPresenter> extends AppCompatActivity {

    @Inject
    protected P presenter;

    protected App application;

    protected Context context;

    private Unbinder unbinder;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        application = (App) getApplication();
        context = this;

        setContentView(initLayoutId());

        unbinder = ButterKnife.bind(this); //ButterKnife绑定视图

        setupActivityComponent(application.getAppComponent()); //获取注射器并注入依赖

        initData();
    }

    protected abstract int initLayoutId();

    protected abstract void setupActivityComponent(AppComponent appComponent);

    protected abstract void initData();


    public void showToast(String content){
        Toast.makeText(this,content,Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(unbinder != Unbinder.EMPTY){ //ButterKnife解绑视图
           unbinder.unbind();
        }
        this.unbinder = null;
        this.presenter = null;
        this.application = null;
    }
}
