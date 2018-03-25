package com.metalcyborg.socialco.login.presentation.signup;

import com.metalcyborg.socialco.login.SignUpContract;
import com.metalcyborg.socialco.login.domain.signup.SignUpInteractor;
import com.metalcyborg.socialco.utils.IRxUtils;

/**
 * Created by cyborg on 24.03.2018.
 */

public class SignUpPresenter implements SignUpContract.Presenter {

    public SignUpPresenter(SignUpInteractor interactor, IRxUtils rxUtils) {

    }

    @Override
    public void attachView(SignUpContract.View view) {

    }

    @Override
    public void detachView() {

    }
}
