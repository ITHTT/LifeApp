package com.htt.db.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.htt.db.dao.GpsLocationRecordInfo;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "tb_gps_location_record".
*/
public class GpsLocationRecordInfoDao extends AbstractDao<GpsLocationRecordInfo, Long> {

    public static final String TABLENAME = "tb_gps_location_record";

    /**
     * Properties of entity GpsLocationRecordInfo.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "id");
        public final static Property RecordTimes = new Property(1, long.class, "recordTimes", false, "record_times");
        public final static Property Latitued = new Property(2, double.class, "latitued", false, "latitued");
        public final static Property Longitude = new Property(3, double.class, "longitude", false, "longitude");
        public final static Property ExistTimes = new Property(4, Long.class, "existTimes", false, "exist_times");
        public final static Property Speed = new Property(5, Float.class, "speed", false, "speed");
        public final static Property Direction = new Property(6, Float.class, "direction", false, "direction");
        public final static Property LocationInfo = new Property(7, String.class, "locationInfo", false, "location_info");
    };


    public GpsLocationRecordInfoDao(DaoConfig config) {
        super(config);
    }
    
    public GpsLocationRecordInfoDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"tb_gps_location_record\" (" + //
                "\"id\" VARCHAR PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"record_times\" INTEGER NOT NULL ," + // 1: recordTimes
                "\"latitued\" REAL NOT NULL ," + // 2: latitued
                "\"longitude\" REAL NOT NULL ," + // 3: longitude
                "\"exist_times\" INTEGER," + // 4: existTimes
                "\"speed\" REAL," + // 5: speed
                "\"direction\" REAL," + // 6: direction
                "\"location_info\" TEXT);"); // 7: locationInfo
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"tb_gps_location_record\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, GpsLocationRecordInfo entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindLong(2, entity.getRecordTimes());
        stmt.bindDouble(3, entity.getLatitued());
        stmt.bindDouble(4, entity.getLongitude());
 
        Long existTimes = entity.getExistTimes();
        if (existTimes != null) {
            stmt.bindLong(5, existTimes);
        }
 
        Float speed = entity.getSpeed();
        if (speed != null) {
            stmt.bindDouble(6, speed);
        }
 
        Float direction = entity.getDirection();
        if (direction != null) {
            stmt.bindDouble(7, direction);
        }
 
        String locationInfo = entity.getLocationInfo();
        if (locationInfo != null) {
            stmt.bindString(8, locationInfo);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public GpsLocationRecordInfo readEntity(Cursor cursor, int offset) {
        GpsLocationRecordInfo entity = new GpsLocationRecordInfo( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.getLong(offset + 1), // recordTimes
            cursor.getDouble(offset + 2), // latitued
            cursor.getDouble(offset + 3), // longitude
            cursor.isNull(offset + 4) ? null : cursor.getLong(offset + 4), // existTimes
            cursor.isNull(offset + 5) ? null : cursor.getFloat(offset + 5), // speed
            cursor.isNull(offset + 6) ? null : cursor.getFloat(offset + 6), // direction
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7) // locationInfo
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, GpsLocationRecordInfo entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setRecordTimes(cursor.getLong(offset + 1));
        entity.setLatitued(cursor.getDouble(offset + 2));
        entity.setLongitude(cursor.getDouble(offset + 3));
        entity.setExistTimes(cursor.isNull(offset + 4) ? null : cursor.getLong(offset + 4));
        entity.setSpeed(cursor.isNull(offset + 5) ? null : cursor.getFloat(offset + 5));
        entity.setDirection(cursor.isNull(offset + 6) ? null : cursor.getFloat(offset + 6));
        entity.setLocationInfo(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(GpsLocationRecordInfo entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(GpsLocationRecordInfo entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
