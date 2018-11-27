package com.cyberon.brian.callbackdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements OnDownLoadCallback {
    private static final String TAG = "MainActivity-CallbackDemo";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DownLoadService downloadService = new DownLoadService(this);
        downloadService.startDownload();
    }

    @Override
    public void onComplete(String message) {
        Log.i(TAG, message);
    }

    @Override
    public void onFail() {
        Log.i(TAG, "Download Fail!!");
    }
}
