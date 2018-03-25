package com.metalcyborg.socialco.data.remote.api;

import com.metalcyborg.socialco.data.remote.bean.PersonBean;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;

/**
 * Created by cyborg on 25.03.2018.
 */

public interface WebApi {

    @Headers({"Content-Type:application/json"})
    @GET("login")
    Single<PersonBean> login(@Header("Authorization") String token);
}
