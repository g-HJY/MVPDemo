package com.skycomm.mvpdemo.http;

import java.util.concurrent.TimeUnit;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by _H_JY on 2018/5/11.
 */

@Module
public class HttpModule {

    private static final int DEFAULT_CONNECT_TIMEOUT = 10;

    private static final int DEFAULT_READ_TIMEOUT = 10;

    private static final int DEFAULT_WRITE_TIMEOUT = 10;


    @Singleton
    @Provides
    Retrofit provideRetrofit(OkHttpClient okHttpClient, HttpUrl baseUrl) {

        return new Retrofit.Builder()
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .baseUrl(baseUrl)
                .build();
    }


    @Singleton
    @Provides
    OkHttpClient provideOkHttpClient() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.connectTimeout(DEFAULT_CONNECT_TIMEOUT, TimeUnit.SECONDS)
                .readTimeout(DEFAULT_READ_TIMEOUT, TimeUnit.SECONDS)
                .writeTimeout(DEFAULT_WRITE_TIMEOUT, TimeUnit.SECONDS);

        return builder.build();
    }


}
