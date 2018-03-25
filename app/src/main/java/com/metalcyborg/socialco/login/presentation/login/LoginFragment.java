package com.metalcyborg.socialco.login.presentation.login;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.metalcyborg.socialco.R;
import com.metalcyborg.socialco.di.injector.LoginInjector;
import com.metalcyborg.socialco.login.LoginContract;
import com.metalcyborg.socialco.login.presentation.IRouter;
import com.metalcyborg.socialco.login.presentation.Screen;

import javax.inject.Inject;

public class LoginFragment extends Fragment implements LoginContract.View {

    @Inject
    LoginContract.Presenter mPresenter;

    private IRouter mRouter;

    private Button mSignUpButton;
    private Button mLoginButton;
    private EditText mLoginEditText;
    private EditText mPasswordEditText;

    public LoginFragment() {
        // Required empty public constructor
    }

    public static LoginFragment newInstance() {
        return new LoginFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LoginInjector.getLoginComponent().inject(this);
        mPresenter.attachView(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_login, container, false);

        mSignUpButton = view.findViewById(R.id.sign_up_button);
        mSignUpButton.setOnClickListener(v -> mPresenter.signUpButtonClick());
        mLoginButton = view.findViewById(R.id.login_button);
        mLoginButton.setOnClickListener(v -> mPresenter.loginButtonClick());

        mLoginEditText = view.findViewById(R.id.login_edit_text);
        mPasswordEditText = view.findViewById(R.id.password_edit_text);

        return view;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mPresenter.detachView();
        if (getActivity().isFinishing()) {
            LoginInjector.cancelLoginComponent();
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mRouter = (IRouter) context;
    }

    @Override
    public void showSignUpScreen() {
        mRouter.setScreen(Screen.SIGN_UP);
    }

    @Override
    public void showLoginScreen() {
        mRouter.setScreen(Screen.LOGIN);
    }

    @Override
    public void showMainScreen() {

    }

    @Override
    public void setLoginProgress(boolean progress) {

    }

    @Override
    public void showError(String message) {

    }

    @Override
    public String getLogin() {
        return mLoginEditText.getText().toString();
    }

    @Override
    public String getPassword() {
        return mPasswordEditText.getText().toString();
    }
}
