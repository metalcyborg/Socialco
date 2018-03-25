package com.metalcyborg.socialco.di.injector;

import com.metalcyborg.socialco.SocialcoApp;
import com.metalcyborg.socialco.di.component.LoginComponent;
import com.metalcyborg.socialco.di.module.LoginModule;

/**
 * Created by cyborg on 24.03.2018.
 */
public class LoginInjector {

    private static LoginComponent sLoginComponent;

    public static LoginComponent getLoginComponent() {
        if (sLoginComponent == null) {
            sLoginComponent = SocialcoApp
                    .getComponent()
                    .plusLoginComponent(new LoginModule());
        }

        return sLoginComponent;
    }

    public static void cancelLoginComponent() {
        sLoginComponent = null;
    }
}
