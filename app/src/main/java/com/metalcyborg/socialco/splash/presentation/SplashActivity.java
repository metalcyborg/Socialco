package com.metalcyborg.socialco.splash.presentation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.metalcyborg.socialco.R;
import com.metalcyborg.socialco.di.injector.SplashInjector;
import com.metalcyborg.socialco.login.presentation.LoginActivity;
import com.metalcyborg.socialco.splash.SplashContract;

import javax.inject.Inject;

public class SplashActivity extends AppCompatActivity implements SplashContract.View {

    @Inject
    SplashContract.Presenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        SplashInjector.getSplashComponent().inject(this);

        mPresenter.onAttach(this);
        mPresenter.makeLongOperation();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (isFinishing()) {
            SplashInjector.cancelSplashComponent();
        }
    }

    @Override
    public void showLoginScreen() {
        startActivity(new Intent(this, LoginActivity.class));
        finish();
    }
}
