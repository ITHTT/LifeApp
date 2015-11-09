package com.htt.models;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * GPS记录点的信息
 * Created by Administrator on 2015/10/19.
 */
public class GpsLocationInfo implements Parcelable {
    private String id;
    /**录制时间*/
    private long recordTimes;
    /**停留的时间*/
    private long existTimes;
    /**纬度*/
    private double latitude;
    /**经度*/
    private double longitude;
    /**速度*/
    private float speed;
    /**方向/角度*/
    private float direction;
    /**位置信息*/
    private String locationInfo;

    public GpsLocationInfo() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLocationInfo() {
        return locationInfo;
    }

    public void setLocationInfo(String locationInfo) {
        this.locationInfo = locationInfo;
    }

    public float getDirection() {
        return direction;
    }

    public void setDirection(float direction) {
        this.direction = direction;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public long getExistTimes() {
        return existTimes;
    }

    public void setExistTimes(long existTimes) {
        this.existTimes = existTimes;
    }

    public long getRecordTimes() {
        return recordTimes;
    }

    public void setRecordTimes(long recordTimes) {
        this.recordTimes = recordTimes;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeLong(this.recordTimes);
        dest.writeLong(this.existTimes);
        dest.writeDouble(this.latitude);
        dest.writeDouble(this.longitude);
        dest.writeFloat(this.speed);
        dest.writeFloat(this.direction);
        dest.writeString(this.locationInfo);
    }



    private GpsLocationInfo(Parcel in) {
        this.id = in.readString();
        this.recordTimes = in.readLong();
        this.existTimes = in.readLong();
        this.latitude = in.readDouble();
        this.longitude = in.readDouble();
        this.speed = in.readFloat();
        this.direction = in.readFloat();
        this.locationInfo = in.readString();
    }

    public static final Parcelable.Creator<GpsLocationInfo> CREATOR = new Parcelable.Creator<GpsLocationInfo>() {
        public GpsLocationInfo createFromParcel(Parcel source) {
            return new GpsLocationInfo(source);
        }

        public GpsLocationInfo[] newArray(int size) {
            return new GpsLocationInfo[size];
        }
    };
}
