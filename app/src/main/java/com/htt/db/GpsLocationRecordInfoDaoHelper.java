package com.htt.db;

import com.htt.db.dao.GpsLocationRecordInfo;
import com.htt.db.dao.GpsLocationRecordInfoDao;

/**
 * Created by Administrator on 2015/10/19.
 */
public class GpsLocationRecordInfoDaoHelper {
    private GpsLocationRecordInfoDao gpsLocationRecordInfoDao;

    public GpsLocationRecordInfoDaoHelper(){
        gpsLocationRecordInfoDao=SQLiteDBHelper.getSqLiteDBHelper().getDaoSession().getGpsLocationRecordInfoDao();
    }



}
