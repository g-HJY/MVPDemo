package com.skycomm.mvpdemo.db.dao;


import com.skycomm.mvpdemo.bean.User;

import java.util.List;

public interface UserDao {


	long addUser(User user);


	List<User> findAllUserInfo();

}
