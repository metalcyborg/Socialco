package com.metalcyborg.socialco.data;

import com.metalcyborg.socialco.data.remote.bean.PersonBean;

import io.reactivex.Single;

/**
 * Created by cyborg on 25.03.2018.
 */

public interface IRepository {

    Single<PersonBean> login(String token);
}
