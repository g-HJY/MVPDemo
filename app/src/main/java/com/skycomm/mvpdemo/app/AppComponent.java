package com.skycomm.mvpdemo.app;

import android.app.Application;

import com.google.gson.Gson;
import com.skycomm.mvpdemo.db.DBModule;
import com.skycomm.mvpdemo.db.manager.DBManager;
import com.skycomm.mvpdemo.http.HttpModule;
import com.skycomm.mvpdemo.http.manager.HttpManager;
import com.skycomm.mvpdemo.http.networkinter.ApiServiceModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by _H_JY on 2018/5/11.
 */

@Singleton
@Component(modules = {AppModule.class, HttpModule.class, ApiServiceModule.class, DBModule.class})
public interface AppComponent {

    Application application();

    Gson gson();

    HttpManager httpManager();

    DBManager dbManager();

}
