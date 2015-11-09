package com.htt.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;

/**
 * Created by Administrator on 2015/10/20.
 */
abstract public class BaseFragment extends Fragment{
    private View contentView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        contentView=inflaterContentView(inflater,container,savedInstanceState);
        ButterKnife.bind(this,contentView);
        initViews(contentView);
        return contentView;
    }

    abstract protected View inflaterContentView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState);

    abstract protected void initViews(View view);

    @Override
    public void onDestroy() {
        ButterKnife.unbind(this);
        if(contentView!=null){
            contentView.destroyDrawingCache();
            contentView=null;
        }
        super.onDestroy();
    }
}
