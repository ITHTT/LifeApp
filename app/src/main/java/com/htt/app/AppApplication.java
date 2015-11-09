package com.htt.app;

import android.app.Application;

import com.htt.db.SQLiteDBHelper;

/**
 * Created by Administrator on 2015/10/19.
 */
public class AppApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        AppExceptionHandler.getInstance().init(this);
        SQLiteDBHelper.initSQLiteDBHelper(this);
        ActivityStacksManager.initActivityStacksManager();
    }
}
