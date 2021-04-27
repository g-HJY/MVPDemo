package com.skycomm.mvpdemo.http.manager;

import com.skycomm.mvpdemo.http.networkinter.UserService;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by _H_JY on 2018/5/12.
 */

@Singleton
public class HttpManager {

    @Inject
    public UserService userService;

    @Inject
    public HttpManager(){}


}
