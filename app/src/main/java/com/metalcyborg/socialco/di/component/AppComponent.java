package com.metalcyborg.socialco.di.component;

import com.metalcyborg.socialco.di.module.AppModule;
import com.metalcyborg.socialco.di.module.NetworkModule;
import com.metalcyborg.socialco.di.module.SplashModule;
import com.metalcyborg.socialco.di.module.UtilsModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by cyborg on 25.02.2018.
 */
@Component(modules = {AppModule.class, UtilsModule.class, NetworkModule.class})
@Singleton
public interface AppComponent {

    SplashComponent plusSplashComponent(SplashModule module);
}
