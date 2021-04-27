package com.skycomm.mvpdemo.base;

import android.content.Context;

import com.skycomm.mvpdemo.contract.IModel;
import com.skycomm.mvpdemo.contract.IView;

import javax.inject.Inject;

/**
 * Created by _H_JY on 2018/5/12.
 */

public class BasePresenter<M extends IModel,V extends IView> {

    @Inject
    protected M model;

    @Inject
    protected V view;

    public BasePresenter(){}

    protected Context getContext(){return (Context) view;}


}
