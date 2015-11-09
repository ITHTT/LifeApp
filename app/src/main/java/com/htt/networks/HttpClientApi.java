package com.htt.networks;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;

/**
 * Created by Administrator on 2015/10/16.
 */
public class HttpClientApi {
    private OkHttpClient okHttpClient;
    public HttpClientApi(){
        okHttpClient=new OkHttpClient();
    }
}
