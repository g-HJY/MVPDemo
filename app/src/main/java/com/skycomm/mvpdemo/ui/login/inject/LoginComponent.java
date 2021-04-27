package com.skycomm.mvpdemo.ui.login.inject;

import com.skycomm.mvpdemo.app.AppComponent;
import com.skycomm.mvpdemo.scope.ActivityScope;
import com.skycomm.mvpdemo.ui.login.LoginActivity;

import dagger.Component;

/**
 * Created by _H_JY on 2018/5/12.
 */
@ActivityScope
@Component(modules = LoginModule.class,dependencies = AppComponent.class)
public interface LoginComponent {

    void inject(LoginActivity loginActivity);

}
