package com.metalcyborg.socialco.data.remote;

import com.metalcyborg.socialco.data.remote.api.WebApi;
import com.metalcyborg.socialco.data.remote.bean.PersonBean;

import io.reactivex.Single;
import retrofit2.Retrofit;

/**
 * Created by cyborg on 25.03.2018.
 */
public class RemoteDataSource implements IRemoteDataSource {

    private Retrofit mRetrofit;

    public RemoteDataSource(Retrofit retrofit) {
        mRetrofit = retrofit;
    }

    @Override
    public Single<PersonBean> login(String token) {
        WebApi webApi = mRetrofit.create(WebApi.class);
        return webApi.login(token);
    }
}
