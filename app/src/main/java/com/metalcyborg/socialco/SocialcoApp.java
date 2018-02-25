package com.metalcyborg.socialco;

import android.app.Application;

import com.metalcyborg.socialco.di.component.AppComponent;
import com.metalcyborg.socialco.di.component.DaggerAppComponent;
import com.metalcyborg.socialco.di.module.AppModule;
import com.metalcyborg.socialco.di.module.NetworkModule;
import com.metalcyborg.socialco.di.module.UtilsModule;

/**
 * Created by cyborg on 25.02.2018.
 */
public class SocialcoApp extends Application {

    private static AppComponent sAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        sAppComponent = buildComponent();
    }

    public static AppComponent getComponent() {
        return sAppComponent;
    }

    protected AppComponent buildComponent() {
        return DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .utilsModule(new UtilsModule())
                .networkModule(new NetworkModule())
                .build();
    }
}
