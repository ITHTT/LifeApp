package com.htt.db.dao;

import de.greenrobot.daogenerator.DaoGenerator;
import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Schema;

public class UserInfoGreenDaoGenerator {
    private static int dbVersion=1;
    private static String packagePath="com.htt.db.dao";
    public static void main(String[] args) throws  Exception{
        Schema schema=new Schema(dbVersion,packagePath);
        createUserTable(schema);
        createUserGpsRecordTable(schema);
        new DaoGenerator().generateAll(schema, "../LifeApp/lib/src-gen");
        System.out.println("创建数据库ORM");
    }

    private static void createUserTable(Schema schema){
        Entity entity=schema.addEntity("UserInfo");
        entity.setTableName("tb_user_info");
        entity.addIdProperty().columnName("id").columnType("Integer").primaryKey().autoincrement();
        entity.addStringProperty("phone").columnName("phone").unique().notNull();
        entity.addStringProperty("userName").columnName("user_name").notNull();
        entity.addStringProperty("userPassword").columnName("user_password").notNull();
    }

    private static void createUserLifeItemsTable(Schema schema){

    }

    private static void createUserPictureTable(Schema schema){

    }

    private static void createUserPlanTable(Schema schema){

    }

    private static void createUserGpsRecordTable(Schema schema){
        Entity entity=schema.addEntity("GpsLocationRecordInfo");
        entity.setTableName("tb_gps_location_record");
        entity.addIdProperty().columnName("id").columnType("VARCHAR").primaryKey().autoincrement();
        entity.addLongProperty("recordTimes").columnName("record_times").notNull();
        entity.addDoubleProperty("latitued").columnName("latitued").notNull();
        entity.addDoubleProperty("longitude").columnName("longitude").notNull();
        entity.addLongProperty("existTimes").columnName("exist_times");
        entity.addFloatProperty("speed").columnName("speed");
        entity.addFloatProperty("direction").columnName("direction");
        entity.addStringProperty("locationInfo").columnName("location_info");

    }




}
