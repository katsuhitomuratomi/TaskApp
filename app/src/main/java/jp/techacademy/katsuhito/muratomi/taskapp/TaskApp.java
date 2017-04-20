package jp.techacademy.katsuhito.muratomi.taskapp;

import android.app.Application;

import io.realm.Realm;

/**
 * Created by katsu on 2017/04/02.
 */

public class TaskApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
    }
}
