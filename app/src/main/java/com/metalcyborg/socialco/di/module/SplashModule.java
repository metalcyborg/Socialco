package com.metalcyborg.socialco.di.module;

import com.metalcyborg.socialco.di.scopes.SplashScope;
import com.metalcyborg.socialco.splash.SplashContract;
import com.metalcyborg.socialco.splash.domain.SplashInteractor;
import com.metalcyborg.socialco.splash.domain.SplashInteractorImpl;
import com.metalcyborg.socialco.splash.presentation.SplashPresenter;
import com.metalcyborg.socialco.utils.IRxUtils;
import com.metalcyborg.socialco.utils.RxUtils;

import dagger.Module;
import dagger.Provides;

/**
 * Created by cyborg on 25.02.2018.
 */
@Module
public class SplashModule {

    @Provides
    @SplashScope
    SplashInteractor provideInteractor() {
        return new SplashInteractorImpl();
    }

    @Provides
    @SplashScope
    SplashContract.Presenter providePresenter(SplashInteractor splashInteractor, IRxUtils rxUtils) {
        return new SplashPresenter(splashInteractor, rxUtils);
    }
}
