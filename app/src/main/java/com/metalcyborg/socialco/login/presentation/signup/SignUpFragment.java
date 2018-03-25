package com.metalcyborg.socialco.login.presentation.signup;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.metalcyborg.socialco.R;
import com.metalcyborg.socialco.di.injector.SignUpInjector;
import com.metalcyborg.socialco.login.SignUpContract;

import javax.inject.Inject;


public class SignUpFragment extends Fragment implements SignUpContract.View {

    @Inject
    SignUpContract.Presenter mPresenter;

    public SignUpFragment() {
        // Required empty public constructor
    }

    public static SignUpFragment newInstance() {
        return new SignUpFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        SignUpInjector.getSignUpComponent().inject(this);
        mPresenter.attachView(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sign_up, container, false);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mPresenter.detachView();
        SignUpInjector.cancelSignUpComponent();
    }
}
