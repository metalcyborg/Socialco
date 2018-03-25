package com.metalcyborg.socialco.login;

import com.metalcyborg.socialco.BasePresenter;

/**
 * Created by cyborg on 25.02.2018.
 */
public interface LoginContract {

    interface View {

        void showSignUpScreen();

        void showLoginScreen();

        void showMainScreen();

        void setLoginProgress(boolean progress);

        void showError(String message);

        String getLogin();

        String getPassword();
    }

    interface Presenter extends BasePresenter<View> {

        void loginButtonClick();

        void signUpButtonClick();
    }
}
