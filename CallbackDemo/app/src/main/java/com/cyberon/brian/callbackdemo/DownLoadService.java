package com.cyberon.brian.callbackdemo;

public class DownLoadService {
    private OnDownLoadCallback mOnDownLoadCallback;
    public DownLoadService(OnDownLoadCallback callback) {
        this.mOnDownLoadCallback = callback;
    }

    public void startDownload() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(8000);
                    mOnDownLoadCallback.onComplete("Complete!!");
                } catch (InterruptedException e) {
                    mOnDownLoadCallback.onFail();
                    e.printStackTrace();
                }
            }
        });
        thread.start();
    }
}
