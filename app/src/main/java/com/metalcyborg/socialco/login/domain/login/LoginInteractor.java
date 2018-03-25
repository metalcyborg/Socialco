package com.metalcyborg.socialco.login.domain.login;

import com.metalcyborg.socialco.data.IRepository;
import com.metalcyborg.socialco.data.entity.Person;
import com.metalcyborg.socialco.data.remote.bean.converter.PersonConverter;
import com.metalcyborg.socialco.util.TokenUtil;

import io.reactivex.Single;

/**
 * Created by cyborg on 24.03.2018.
 */
public class LoginInteractor {

    private IRepository mRepository;

    public LoginInteractor(IRepository repository) {
        mRepository = repository;
    }

    public Single<Person> login(String login, String password) {
        String token = login + ":" + password;
        String base64Token = "Basic " + TokenUtil.getBase64String(token);
        return mRepository
                .login(base64Token)
                .map(PersonConverter::convert);
    }
}
