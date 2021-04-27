package com.skycomm.mvpdemo.contract;

import com.skycomm.mvpdemo.bean.JsonResult;
import com.skycomm.mvpdemo.bean.User;

import rx.Observable;

/**
 * Created by _H_JY on 2018/5/12.
 */

public interface LoginContract {

    interface Model extends IModel {
      Observable<JsonResult> login(String account, String password);

      long addUserToDB(User user);
    }


    interface View extends IView {
        void loginSuccess(String result);

        void loginFailure(String result);
    }


    interface Presenter extends IPresenter {
        void login(String account,String password);
    }


}
