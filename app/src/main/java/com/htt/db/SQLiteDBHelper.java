package com.htt.db;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.htt.db.dao.DaoMaster;
import com.htt.db.dao.DaoSession;

/**
 * Created by Administrator on 2015/10/19.
 */
public class SQLiteDBHelper {
    private String DB_NAME="db_user";
    private DaoMaster daoMaster;
    private DaoSession daoSession;
    private static SQLiteDBHelper sqLiteDBHelper=null;

    public static void initSQLiteDBHelper(Context context){
        if(sqLiteDBHelper==null){
            sqLiteDBHelper=new SQLiteDBHelper(context);
        }
    }

    public static SQLiteDBHelper getSqLiteDBHelper(){
        if(sqLiteDBHelper==null){
            throw new RuntimeException("SQLiteDBHelper没有初始化。。。");
        }
        return sqLiteDBHelper;
    }

    public SQLiteDBHelper(Context context){
        DaoMaster.OpenHelper openHelper=new DaoMaster.DevOpenHelper(context,DB_NAME,null);
        daoMaster=new DaoMaster(openHelper.getWritableDatabase());
        daoSession=daoMaster.newSession();
    }

    public SQLiteDatabase getSQLiteDatabase(){
        return daoMaster.getDatabase();
    }

    public DaoSession getDaoSession() {
        return daoSession;
    }

    public DaoMaster getDaoMaster() {
        return daoMaster;
    }

}
