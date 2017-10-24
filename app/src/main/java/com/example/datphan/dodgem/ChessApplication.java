package com.example.datphan.dodgem;

import android.app.Application;

/**
 * Created by dat.phan on 24/10/2017.
 */

public class ChessApplication extends Application {

    private static ChessApplication instance;

    public static ChessApplication getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        instance = this;
        super.onCreate();
    }
}
