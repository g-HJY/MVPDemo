package com.skycomm.mvpdemo.db.manager;

import com.skycomm.mvpdemo.db.dao.UserDao;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by _H_JY on 2018/5/13.
 */

@Singleton
public class DBManager {

    @Inject
    public UserDao userDao;

    @Inject
    public DBManager(){}


}
