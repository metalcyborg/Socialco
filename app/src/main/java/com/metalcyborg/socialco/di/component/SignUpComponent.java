package com.metalcyborg.socialco.di.component;

import com.metalcyborg.socialco.di.module.SignUpModule;
import com.metalcyborg.socialco.di.scopes.SignUpScope;
import com.metalcyborg.socialco.login.presentation.signup.SignUpFragment;

import dagger.Subcomponent;

/**
 * Created by cyborg on 24.03.2018.
 */
@SignUpScope
@Subcomponent(modules = {SignUpModule.class})
public interface SignUpComponent {

    void inject(SignUpFragment fragment);
}
