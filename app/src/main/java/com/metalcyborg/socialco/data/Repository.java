package com.metalcyborg.socialco.data;

import com.metalcyborg.socialco.data.remote.IRemoteDataSource;
import com.metalcyborg.socialco.data.remote.bean.PersonBean;

import io.reactivex.Single;

/**
 * Created by cyborg on 25.03.2018.
 */

public class Repository implements IRepository {

    private IRemoteDataSource mRemoteDataSource;

    public Repository(IRemoteDataSource remoteDataSource) {
        mRemoteDataSource = remoteDataSource;
    }

    @Override
    public Single<PersonBean> login(String token) {
        return mRemoteDataSource.login(token);
    }
}
