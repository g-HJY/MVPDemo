package com.skycomm.mvpdemo.http.networkinter;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.HttpUrl;
import retrofit2.Retrofit;

/**
 * Created by _H_JY on 2018/5/11.
 */

@Module
public class ApiServiceModule {


    @Singleton
    @Provides
    HttpUrl provideBaseUrl(){
        return HttpUrl.parse("http://120.79.147.46:8080/RenlRenw/");
    }



    @Singleton
    @Provides
    UserService provideUserService(Retrofit retrofit){
        return retrofit.create(UserService.class);
    }

}
