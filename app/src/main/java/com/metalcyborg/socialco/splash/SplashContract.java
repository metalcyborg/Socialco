package com.metalcyborg.socialco.splash;

import com.metalcyborg.socialco.BasePresenter;

/**
 * Created by cyborg on 25.02.2018.
 */
public interface SplashContract {

    interface View {

        void showLoginScreen();
    }

    interface Presenter extends BasePresenter<View> {

        void makeLongOperation();
    }
}
