package com.metalcyborg.socialco.di.injector;

import com.metalcyborg.socialco.SocialcoApp;
import com.metalcyborg.socialco.di.component.SignUpComponent;
import com.metalcyborg.socialco.di.module.SignUpModule;

/**
 * Created by cyborg on 24.03.2018.
 */
public class SignUpInjector {

    private static SignUpComponent sSignUpComponent;

    public static SignUpComponent getSignUpComponent() {
        if (sSignUpComponent == null) {
            sSignUpComponent = SocialcoApp
                    .getComponent()
                    .plusSignUpComponent(new SignUpModule());
        }

        return sSignUpComponent;
    }

    public static void cancelSignUpComponent() {
        sSignUpComponent = null;
    }
}
