package com.metalcyborg.socialco.di.module;

import com.metalcyborg.socialco.data.IRepository;
import com.metalcyborg.socialco.di.scopes.LoginScope;
import com.metalcyborg.socialco.login.LoginContract;
import com.metalcyborg.socialco.login.domain.login.LoginInteractor;
import com.metalcyborg.socialco.login.presentation.login.LoginPresenter;
import com.metalcyborg.socialco.utils.IRxUtils;

import dagger.Module;
import dagger.Provides;

/**
 * Created by cyborg on 24.03.2018.
 */
@Module
public class LoginModule {

    @LoginScope
    @Provides
    LoginInteractor provideInteractor(IRepository repository) {
        return new LoginInteractor(repository);
    }

    @LoginScope
    @Provides
    LoginContract.Presenter providePresenter(LoginInteractor interactor, IRxUtils rxUtils) {
        return new LoginPresenter(interactor, rxUtils);
    }
}
