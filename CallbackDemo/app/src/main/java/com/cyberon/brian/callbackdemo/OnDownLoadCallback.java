package com.cyberon.brian.callbackdemo;

public interface OnDownLoadCallback {
    void onComplete(String message);
    void onFail();
}
