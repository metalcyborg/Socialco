package com.metalcyborg.socialco.di.component;

import com.metalcyborg.socialco.di.module.LoginModule;
import com.metalcyborg.socialco.di.scopes.LoginScope;
import com.metalcyborg.socialco.login.presentation.login.LoginFragment;

import dagger.Subcomponent;

/**
 * Created by cyborg on 24.03.2018.
 */
@LoginScope
@Subcomponent(modules = {LoginModule.class})
public interface LoginComponent {

    void inject(LoginFragment fragment);
}
