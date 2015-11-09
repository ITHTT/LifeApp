package com.htt.views.widgets;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;

import com.htt.activitys.R;
import com.htt.views.widgets.circleprogressview.CircleProgressView;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * 带进度条的WebView
 */
/**
 * Created by Administrator on 2015/11/6.
 */
public class ProgressWebView extends FrameLayout {
    @Bind(R.id.webView)
    protected WebView webView;
    @Bind(R.id.progressView)
    protected CircleProgressView circleProgressView;

    public ProgressWebView(Context context) {
        super(context);
        initViews();
    }

    public ProgressWebView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initViews();
    }

    public ProgressWebView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initViews();
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public ProgressWebView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        initViews();
    }

    private void initViews(){
        View view= LayoutInflater.from(this.getContext()).inflate(R.layout.layout_progress_webview,this,true);
        ButterKnife.bind(this, view);
    }

    public WebView getWebView(){
        return webView;
    }

    public WebSettings getWebSettings(){
        return webView.getSettings();
    }

    public void loadUrl(String url){
        webView.loadUrl(url);
    }

    public void isShowProgressBar(boolean isShow){
        if(isShow){
            if(circleProgressView.getVisibility()!=View.VISIBLE){
                circleProgressView.setVisibility(View.VISIBLE);
            }
        }else{
            if(circleProgressView.getVisibility()!=View.GONE){
                circleProgressView.setVisibility(View.GONE);
            }
        }
    }

    public class WebViewClient extends android.webkit.WebViewClient{
        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
            isShowProgressBar(true);
        }

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            return super.shouldOverrideUrlLoading(view, url);
        }

        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
            isShowProgressBar(false);
        }

        @Override
        public void onLoadResource(WebView view, String url) {
            super.onLoadResource(view, url);
        }

        @Override
        public void onPageCommitVisible(WebView view, String url) {
            super.onPageCommitVisible(view, url);
        }
    }

    public class CustomWebChromeClient extends WebChromeClient{


    }



}

