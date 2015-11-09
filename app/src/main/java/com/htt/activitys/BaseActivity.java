package com.htt.activitys;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.htt.app.ActivityStacksManager;

import butterknife.ButterKnife;

/**
 * Created by Administrator on 2015/10/16.
 */
abstract public class BaseActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityStacksManager.getActivityStacksManager().addActivity(this);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setRootContentView();
        ButterKnife.bind(this);
        initViews();
    }

    abstract  protected void setRootContentView();

    abstract protected void initViews();

    protected void back(){
        this.finish();
    }

    @Override
    public void onBackPressed() {
        back();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case android.R.id.home:
                back();
                break;
        }
        return true;
    }

    @Override
    protected void onDestroy() {
        ButterKnife.unbind(this);
        ActivityStacksManager.getActivityStacksManager().finishActivity(this);
        super.onDestroy();
    }
}
