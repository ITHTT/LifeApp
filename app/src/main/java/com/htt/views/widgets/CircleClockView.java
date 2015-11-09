package com.htt.views.widgets;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

/**
 * 圆形时钟
 * Created by Administrator on 2015/10/16.
 */
public class CircleClockView extends View {
    private static final int MIN_SIZE=120;

    /**时钟大小*/
    private int clockSize;

    /**时钟指针*/
    private Path hoursPointer;
    /**分钟指针*/
    private Path minutesPointer;
    /**秒钟指针*/
    private Path secondsPointer;

    /**时钟画笔*/
    private Paint hoursPaint;
    /**分钟画笔*/
    private Paint minutePaint;
    /**秒钟画笔*/
    private Paint secondsPaint;

    public CircleClockView(Context context) {
        super(context);
    }

    public CircleClockView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public CircleClockView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public CircleClockView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    private void initViews(){
        clockSize=120;
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int width=MeasureSpec.getSize(widthMeasureSpec);
        if(MeasureSpec.getMode(widthMeasureSpec)==MeasureSpec.AT_MOST||MeasureSpec.getMode(widthMeasureSpec)==MeasureSpec.EXACTLY){
            if(width<MIN_SIZE){
                width=MIN_SIZE;
            }
        }else{
            width=MIN_SIZE;
        }
        clockSize=width;
        setMeasuredDimension(clockSize,clockSize);
    }


}
