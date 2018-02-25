package com.metalcyborg.socialco.di.injector;

import com.metalcyborg.socialco.SocialcoApp;
import com.metalcyborg.socialco.di.component.SplashComponent;
import com.metalcyborg.socialco.di.module.SplashModule;

/**
 * Created by cyborg on 25.02.2018.
 */
public class SplashInjector {

    private static SplashComponent sSplashComponent;

    public static SplashComponent getSplashComponent() {
        if (sSplashComponent == null) {
            sSplashComponent = SocialcoApp.getComponent()
                    .plusSplashComponent(new SplashModule());
        }

        return sSplashComponent;
    }

    public static void cancelSplashComponent() {
        sSplashComponent = null;
    }
}
