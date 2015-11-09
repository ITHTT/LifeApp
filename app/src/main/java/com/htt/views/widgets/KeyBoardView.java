package com.htt.views.widgets;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.GridLayout;

import com.htt.activitys.R;

/**
 * Created by Administrator on 2015/10/19.
 */
public class KeyBoardView extends GridLayout{
    public KeyBoardView(Context context) {
        super(context);
        initViews();
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public KeyBoardView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        initViews();
    }

    public KeyBoardView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initViews();
    }

    public KeyBoardView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initViews();
    }

    private void initViews(){
        View view= LayoutInflater.from(this.getContext()).inflate(R.layout.layout_key_board,this,true);
        this.setColumnCount(3);
        this.setRowCount(4);
    }
}
