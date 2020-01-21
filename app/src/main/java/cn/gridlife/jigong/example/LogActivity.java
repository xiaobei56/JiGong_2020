package cn.gridlife.jigong.example;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * @author XiaoBei
 * @package cn.gridlife.jigong.example.LogActivity
 * @FileName LogActivity
 * @date 2019/12/20 17:05
 * @description TODO
 */
public abstract class LogActivity extends AppCompatActivity {
    public void setOpenLop(boolean openLop) {
        this.openLop = openLop;
    }
    private String tag;
    boolean openLop = true;

    public boolean isOpenLog() {
        return openLop;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tag=getTagName();
    }

    public abstract String getTagName();


    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
