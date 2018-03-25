package com.metalcyborg.socialco.splash.presentation;

import android.os.Handler;
import android.util.Log;

import com.metalcyborg.socialco.splash.SplashContract;
import com.metalcyborg.socialco.splash.domain.SplashInteractor;
import com.metalcyborg.socialco.utils.IRxUtils;
import com.metalcyborg.socialco.utils.RxUtils;

import java.util.concurrent.TimeUnit;

/**
 * Created by cyborg on 25.02.2018.
 */
public class SplashPresenter implements SplashContract.Presenter {

    private static final String TAG = "Splash screen";
    private static final int DELAY_TIME = 2000;
    private SplashContract.View mView;
    private SplashInteractor mInteractor;
    private IRxUtils mRxUtils;

    public SplashPresenter(SplashInteractor interactor, IRxUtils rxUtils) {
        mInteractor = interactor;
        mRxUtils = rxUtils;
    }

    @Override
    public void attachView(SplashContract.View view) {
        mView = view;
    }

    @Override
    public void detachView() {

    }

    @Override
    public void makeLongOperation() {
        mInteractor.makeLongOperation()
                .subscribeOn(mRxUtils.getComputationScheduler())
                .observeOn(mRxUtils.getMainThreadScheduler())
                .delay(DELAY_TIME, TimeUnit.MILLISECONDS)
                .subscribe((result, exception) -> {
                    if (exception != null) {
                        Log.d(TAG, "Splash screen error");
                    } else {
                        mView.showLoginScreen();
                    }
                });
    }
}
