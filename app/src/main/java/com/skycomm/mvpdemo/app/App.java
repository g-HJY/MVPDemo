package com.skycomm.mvpdemo.app;

import android.app.Application;

import com.skycomm.mvpdemo.db.DBModule;
import com.skycomm.mvpdemo.http.HttpModule;
import com.skycomm.mvpdemo.http.networkinter.ApiServiceModule;

/**
 * Created by _H_JY on 2018/5/11.
 */

public class App extends Application {

    private AppComponent appComponent;


    @Override
    public void onCreate() {
        super.onCreate();

       appComponent =  DaggerAppComponent
               .builder()
               .appModule(new AppModule(this))
               .httpModule(new HttpModule())
               .apiServiceModule(new ApiServiceModule())
               .dBModule(new DBModule(this))
               .build();

    }



    public AppComponent getAppComponent(){
        return appComponent;
    }
}
