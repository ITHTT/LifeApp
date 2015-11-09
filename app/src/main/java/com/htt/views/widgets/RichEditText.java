package com.htt.views.widgets;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.widget.EditText;

/**
 * 自定义富文本编辑框
 * Created by Administrator on 2015/10/16.
 */
public class RichEditText extends EditText{

    public RichEditText(Context context) {
        super(context);
    }

    public RichEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public RichEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public RichEditText(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    public void addImage(String path){
        ImageSpan span;

    }
}
