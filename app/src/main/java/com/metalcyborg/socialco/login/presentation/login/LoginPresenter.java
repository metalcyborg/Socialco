package com.metalcyborg.socialco.login.presentation.login;

import android.util.Log;
import android.widget.Toast;

import com.metalcyborg.socialco.data.entity.Person;
import com.metalcyborg.socialco.login.LoginContract;
import com.metalcyborg.socialco.login.domain.login.LoginInteractor;
import com.metalcyborg.socialco.utils.IRxUtils;

import io.reactivex.observers.DisposableSingleObserver;

/**
 * Created by cyborg on 04.03.2018.
 */
public class LoginPresenter implements LoginContract.Presenter {

    private final LoginInteractor mInteractor;
    private final IRxUtils mRxUtils;
    private LoginContract.View mView;

    public LoginPresenter(LoginInteractor interactor, IRxUtils rxUtils) {
        mInteractor = interactor;
        mRxUtils = rxUtils;
    }

    @Override
    public void loginButtonClick() {
        String login = mView.getLogin();
        String password = mView.getPassword();

        mInteractor.login(login, password)
                .subscribeOn(mRxUtils.getIOScheduler())
                .observeOn(mRxUtils.getMainThreadScheduler())
                .subscribeWith(new DisposableSingleObserver<Person>() {

                    @Override
                    public void onSuccess(Person person) {
                        Log.d("LOGIN", "Person first name: " + person.getFirstName());
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.d("LOGIN", "Error: " + e);
                    }
                });
    }

    @Override
    public void signUpButtonClick() {
        mView.showSignUpScreen();
    }

    @Override
    public void attachView(LoginContract.View view) {
        mView = view;
    }

    @Override
    public void detachView() {
        mView = null;
    }
}
