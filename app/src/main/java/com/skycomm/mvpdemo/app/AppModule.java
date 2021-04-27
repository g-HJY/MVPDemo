package com.skycomm.mvpdemo.app;

import android.app.Application;

import com.google.gson.Gson;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by _H_JY on 2018/5/11.
 */
@Module
public class AppModule {

    private Application app;

    public AppModule(App app) {
        this.app = app;
    }


    @Singleton
    @Provides
    Application provideApplication() {
        return app;
    }


    @Singleton
    @Provides
    Gson provideGson(){
        return new Gson();
    }



}
