package com.metalcyborg.socialco.login.presentation;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.metalcyborg.socialco.R;
import com.metalcyborg.socialco.login.presentation.login.LoginFragment;
import com.metalcyborg.socialco.login.presentation.signup.SignUpFragment;

public class LoginActivity extends AppCompatActivity implements IRouter {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        setScreen(Screen.LOGIN);
    }

    @Override
    public void setScreen(Screen screen) {
        FragmentManager manager = getSupportFragmentManager();
        Fragment fragment = null;
        switch (screen) {
            case LOGIN:
                fragment = LoginFragment.newInstance();
                break;
            case SIGN_UP:
                fragment = SignUpFragment.newInstance();
                break;
        }

        if (fragment == null) {
            return;
        }
        manager.beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .commit();

    }
}
