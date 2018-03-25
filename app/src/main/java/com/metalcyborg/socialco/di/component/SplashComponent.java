package com.metalcyborg.socialco.di.component;

import com.metalcyborg.socialco.di.module.SplashModule;
import com.metalcyborg.socialco.di.scopes.SplashScope;
import com.metalcyborg.socialco.splash.presentation.SplashActivity;

import dagger.Subcomponent;

/**
 * Created by cyborg on 25.02.2018.
 */
@SplashScope
@Subcomponent(modules = {SplashModule.class})
public interface SplashComponent {

    void inject(SplashActivity activity);
}
