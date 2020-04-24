package io.binarybase.covid19;

import android.app.Application;

import com.yariksoffice.lingver.Lingver;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Lingver.init(this);
    }

}
