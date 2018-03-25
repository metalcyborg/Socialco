package com.metalcyborg.socialco.di.component;

import com.metalcyborg.socialco.di.module.AppModule;
import com.metalcyborg.socialco.di.module.LoginModule;
import com.metalcyborg.socialco.di.module.NetworkModule;
import com.metalcyborg.socialco.di.module.RepositoryModule;
import com.metalcyborg.socialco.di.module.SignUpModule;
import com.metalcyborg.socialco.di.module.SplashModule;
import com.metalcyborg.socialco.di.module.UtilsModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by cyborg on 25.02.2018.
 */
@Singleton
@Component(modules = {AppModule.class, UtilsModule.class, NetworkModule.class, RepositoryModule.class})
public interface AppComponent {

    SplashComponent plusSplashComponent(SplashModule module);
    LoginComponent plusLoginComponent(LoginModule module);
    SignUpComponent plusSignUpComponent(SignUpModule module);
}
