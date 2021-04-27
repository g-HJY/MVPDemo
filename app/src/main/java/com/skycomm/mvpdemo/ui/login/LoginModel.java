package com.skycomm.mvpdemo.ui.login;

import com.skycomm.mvpdemo.base.BaseModel;
import com.skycomm.mvpdemo.bean.JsonResult;
import com.skycomm.mvpdemo.bean.User;
import com.skycomm.mvpdemo.contract.LoginContract;
import com.skycomm.mvpdemo.db.manager.DBManager;
import com.skycomm.mvpdemo.http.manager.HttpManager;
import com.skycomm.mvpdemo.scope.ActivityScope;
import com.skycomm.mvpdemo.utils.Tools;

import javax.inject.Inject;

import rx.Observable;

/**
 * Created by _H_JY on 2018/5/12.
 */

@ActivityScope
public class LoginModel extends BaseModel implements LoginContract.Model {


    @Inject
    HttpManager httpManager;

    @Inject
    DBManager dbManager;

    @Inject
    public LoginModel(){}

    @Override
    public Observable<JsonResult> login(String account, String password) {
        String md5Password = Tools.getMD5(password);
        return httpManager.userService.login(account,md5Password);
    }

    @Override
    public long addUserToDB(User user) {
       return dbManager.userDao.addUser(user);
    }
}
