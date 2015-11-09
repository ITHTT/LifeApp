package com.htt.activitys;

import android.webkit.WebSettings;

import com.htt.views.widgets.ProgressWebView;

import butterknife.Bind;

/**
 * Created by Administrator on 2015/11/6.
 */
public class WebViewActivity extends BaseActivity {
    @Bind(R.id.webView)
    protected ProgressWebView progressWebView;

    @Override
    protected void setRootContentView() {
        setContentView(R.layout.activity_web_view);
    }

    @Override
    protected void initViews() {
       WebSettings webSettings= progressWebView.getWebSettings();
    }
}
