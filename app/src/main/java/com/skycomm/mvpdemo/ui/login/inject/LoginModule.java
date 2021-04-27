package com.skycomm.mvpdemo.ui.login.inject;

import com.skycomm.mvpdemo.contract.LoginContract;
import com.skycomm.mvpdemo.scope.ActivityScope;
import com.skycomm.mvpdemo.ui.login.LoginModel;
import com.skycomm.mvpdemo.ui.login.LoginPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by _H_JY on 2018/5/12.
 */

@Module
public class LoginModule {

    private LoginContract.View view;

    public LoginModule(LoginContract.View view){
        this.view = view;
    }

    @ActivityScope
    @Provides
    LoginContract.Model provideModel(LoginModel loginModel){
        return loginModel;
    }


    @ActivityScope
    @Provides
    LoginContract.View provideView(){
        return this.view;
    }

    @ActivityScope
    @Provides
    LoginContract.Presenter providePresenter(LoginPresenter loginPresenter){
        return loginPresenter;
    }

}
