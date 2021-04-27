package com.skycomm.mvpdemo.http.networkinter;

import com.skycomm.mvpdemo.bean.JsonResult;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by _H_JY on 2018/5/12.
 */

public interface UserService {


    @GET("Person_login.do")
    Observable<JsonResult> login(@Query("account") String account, @Query("password") String password);

}
