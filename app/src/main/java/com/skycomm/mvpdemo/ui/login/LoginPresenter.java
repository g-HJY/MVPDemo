package com.skycomm.mvpdemo.ui.login;

import com.google.gson.Gson;
import com.skycomm.mvpdemo.base.BasePresenter;
import com.skycomm.mvpdemo.bean.JsonResult;
import com.skycomm.mvpdemo.bean.User;
import com.skycomm.mvpdemo.contract.LoginContract;
import com.skycomm.mvpdemo.scope.ActivityScope;

import javax.inject.Inject;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by _H_JY on 2018/5/12.
 */

@ActivityScope
public class LoginPresenter extends BasePresenter<LoginContract.Model, LoginContract.View> implements LoginContract.Presenter {

    @Inject
    Gson gson;

    @Inject
    public LoginPresenter() {
    }


    @Override
    public void login(String account, String password) {

        model.login(account, password)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<JsonResult>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        view.loginFailure(e.getMessage());
                    }

                    @Override
                    public void onNext(JsonResult result) {
                        String userJsonString = result.getResult();
                        User user = gson.fromJson(userJsonString, User.class);
                        long i = model.addUserToDB(user);
                        view.loginSuccess(result.getResult());
                    }
                });

    }
}
