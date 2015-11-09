package com.htt.db;

import com.htt.db.dao.UserInfo;
import com.htt.db.dao.UserInfoDao;

import de.greenrobot.dao.query.QueryBuilder;

/**
 * Created by Administrator on 2015/10/19.
 */
public class UserInfoDaoHelper {
    private UserInfoDao userInfoDao;

    public UserInfoDaoHelper(){
        userInfoDao=SQLiteDBHelper.getSqLiteDBHelper().getDaoSession().getUserInfoDao();
    }

    public UserInfo getUserInfo(String phone,String password){
        QueryBuilder<UserInfo> queryBuilder=userInfoDao.queryBuilder();
        queryBuilder.where(UserInfoDao.Properties.Phone.eq(phone), UserInfoDao.Properties.UserPassword.eq(password));
        return queryBuilder.list().get(0);
    }

    public long insertUserInfo(UserInfo userInfo){
       return userInfoDao.insert(userInfo);
    }

}
