package com.htt.db.dao;

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;

import com.htt.db.dao.UserInfo;
import com.htt.db.dao.GpsLocationRecordInfo;

import com.htt.db.dao.UserInfoDao;
import com.htt.db.dao.GpsLocationRecordInfoDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see de.greenrobot.dao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig userInfoDaoConfig;
    private final DaoConfig gpsLocationRecordInfoDaoConfig;

    private final UserInfoDao userInfoDao;
    private final GpsLocationRecordInfoDao gpsLocationRecordInfoDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        userInfoDaoConfig = daoConfigMap.get(UserInfoDao.class).clone();
        userInfoDaoConfig.initIdentityScope(type);

        gpsLocationRecordInfoDaoConfig = daoConfigMap.get(GpsLocationRecordInfoDao.class).clone();
        gpsLocationRecordInfoDaoConfig.initIdentityScope(type);

        userInfoDao = new UserInfoDao(userInfoDaoConfig, this);
        gpsLocationRecordInfoDao = new GpsLocationRecordInfoDao(gpsLocationRecordInfoDaoConfig, this);

        registerDao(UserInfo.class, userInfoDao);
        registerDao(GpsLocationRecordInfo.class, gpsLocationRecordInfoDao);
    }
    
    public void clear() {
        userInfoDaoConfig.getIdentityScope().clear();
        gpsLocationRecordInfoDaoConfig.getIdentityScope().clear();
    }

    public UserInfoDao getUserInfoDao() {
        return userInfoDao;
    }

    public GpsLocationRecordInfoDao getGpsLocationRecordInfoDao() {
        return gpsLocationRecordInfoDao;
    }

}