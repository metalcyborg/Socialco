package com.metalcyborg.socialco.di.module;

import com.metalcyborg.socialco.di.scopes.SignUpScope;
import com.metalcyborg.socialco.login.SignUpContract;
import com.metalcyborg.socialco.login.domain.signup.SignUpInteractor;
import com.metalcyborg.socialco.login.presentation.signup.SignUpPresenter;
import com.metalcyborg.socialco.utils.IRxUtils;

import dagger.Module;
import dagger.Provides;

/**
 * Created by cyborg on 24.03.2018.
 */
@Module
public class SignUpModule {

    @SignUpScope
    @Provides
    SignUpInteractor provideInteractor() {
        return new SignUpInteractor();
    }

    @SignUpScope
    @Provides
    SignUpContract.Presenter providePresenter(SignUpInteractor interactor, IRxUtils rxUtils) {
        return new SignUpPresenter(interactor, rxUtils);
    }
}
