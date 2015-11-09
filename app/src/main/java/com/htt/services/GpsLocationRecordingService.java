package com.htt.services;

import android.app.Service;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.os.IBinder;
import android.support.annotation.Nullable;

import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationListener;
import com.amap.api.location.LocationManagerProxy;
import com.htt.db.GpsLocationRecordInfoDaoHelper;

/**
 * Created by Administrator on 2015/10/19.
 */
public class GpsLocationRecordingService extends Service implements AMapLocationListener {
    /**高德地图定位工具*/
    private LocationManagerProxy locationManagerProxy;
    /**保存定位位置记录的Dao*/
    private GpsLocationRecordInfoDaoHelper gpsLocationDao;



    @Override
    public void onCreate() {
        super.onCreate();
        locationManagerProxy=LocationManagerProxy.getInstance(this);
        gpsLocationDao=new GpsLocationRecordInfoDaoHelper();

    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onLocationChanged(AMapLocation aMapLocation) {

    }

    @Override
    public void onLocationChanged(Location location) {

    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {

    }

    @Override
    public void onProviderEnabled(String provider) {

    }

    @Override
    public void onProviderDisabled(String provider) {

    }

}
