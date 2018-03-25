package com.metalcyborg.socialco.data.remote;

import com.metalcyborg.socialco.data.remote.bean.PersonBean;

import io.reactivex.Single;
import io.reactivex.annotations.NonNull;

/**
 * Created by cyborg on 25.03.2018.
 */

public interface IRemoteDataSource {

    Single<PersonBean> login(@NonNull String token);
}
