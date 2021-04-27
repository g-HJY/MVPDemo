package com.skycomm.mvpdemo.db;

import android.app.Application;
import android.content.Context;

import com.skycomm.mvpdemo.app.App;
import com.skycomm.mvpdemo.db.dao.UserDao;
import com.skycomm.mvpdemo.db.daoImpl.UserDaoImpl;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by _H_JY on 2018/5/13.
 */

@Module
public class DBModule {


    private Application app;

    public DBModule(App app) {
        this.app = app;
    }


    @Singleton
    @Provides
    UserDao provideUserDao(Context context) {
        return new UserDaoImpl(context);
    }


    @Singleton
    @Provides
    Context provideApplicationContext() {
        return this.app.getApplicationContext();
    }


}
