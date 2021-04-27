package com.skycomm.mvpdemo.db.daoImpl;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;

import com.skycomm.mvpdemo.bean.User;
import com.skycomm.mvpdemo.db.dao.UserDao;
import com.skycomm.mvpdemo.db.manager.DataBaseHelper;
import com.skycomm.mvpdemo.db.manager.DbConstants;

import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {

	private DataBaseHelper dataBaseHelper;


	public UserDaoImpl(Context context){
        dataBaseHelper = DataBaseHelper.getInstance(context);
	}



	@Override
	public long addUser(User user) {
		ContentValues values = new ContentValues();
		values.put(DbConstants.F_PID, user.getPid());
		values.put(DbConstants.F_ACCOUNT, user.getAccount());
		values.put(DbConstants.F_PASSWORD, user.getPassword());
		values.put(DbConstants.F_NAME, user.getName());
		values.put(DbConstants.F_SEX, user.getSex());
		values.put(DbConstants.F_LAT,user.getLat());
		values.put(DbConstants.F_LNG, user.getLng());
		values.put(DbConstants.F_PHOTOURL, user.getPhotourl());
		values.put(DbConstants.F_EMOTION, user.getEmotion());
		values.put(DbConstants.F_AGE, user.getAge());
		values.put(DbConstants.F_SCHOOL, user.getSchool());
		values.put(DbConstants.F_TELEPHONE, user.getTelephone());
		values.put(DbConstants.F_CREATETIME, user.getCreatetime());

		long i = dataBaseHelper.openDatabase().insert(DbConstants.T_USER, null, values);
		dataBaseHelper.closeDatabase();
		return i;
	}


	public List<User> findAllUserInfo() {
		String sql = "select * from " + DbConstants.T_USER;
		Cursor cursor = dataBaseHelper.openDatabase().rawQuery(sql, null);

		List<User> userInfos = new ArrayList<User>();
		if(cursor != null){
			while (cursor.moveToNext()) {
				String pid = cursor.getString(cursor.getColumnIndex(DbConstants.F_PID));
				String account = cursor.getString(cursor.getColumnIndex(DbConstants.F_ACCOUNT));
				String password = cursor.getString(cursor.getColumnIndex(DbConstants.F_PASSWORD));
				String name = cursor.getString(cursor.getColumnIndex(DbConstants.F_NAME));
				String sex = cursor.getString(cursor.getColumnIndex(DbConstants.F_SEX));
				String lat = cursor.getString(cursor.getColumnIndex(DbConstants.F_LAT));
				String lng = cursor.getString(cursor.getColumnIndex(DbConstants.F_LNG));
				String photoUrl = cursor.getString(cursor.getColumnIndex(DbConstants.F_PHOTOURL));
				String emotion = cursor.getString(cursor.getColumnIndex(DbConstants.F_EMOTION));
				String age = cursor.getString(cursor.getColumnIndex(DbConstants.F_AGE));
				String school = cursor.getString(cursor.getColumnIndex(DbConstants.F_SCHOOL));
				String telephone = cursor.getString(cursor.getColumnIndex(DbConstants.F_TELEPHONE));
				String createTime = cursor.getString(cursor.getColumnIndex(DbConstants.F_CREATETIME));

				User user = new User(pid,account,password,name,sex,lng,lat,photoUrl,emotion,age,school,telephone,createTime);

				userInfos.add(user);
			}
			cursor.close();
		}
		dataBaseHelper.close();
		return userInfos;
	}
}
