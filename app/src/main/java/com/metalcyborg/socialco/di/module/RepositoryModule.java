package com.metalcyborg.socialco.di.module;

import com.metalcyborg.socialco.data.IRepository;
import com.metalcyborg.socialco.data.Repository;
import com.metalcyborg.socialco.data.remote.IRemoteDataSource;
import com.metalcyborg.socialco.data.remote.RemoteDataSource;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

/**
 * Created by cyborg on 25.03.2018.
 */
@Module
public class RepositoryModule {

    @Singleton
    @Provides
    IRemoteDataSource provideRemoteDataSource(Retrofit retrofit) {
        return new RemoteDataSource(retrofit);
    }

    @Singleton
    @Provides
    IRepository provideRepository(IRemoteDataSource remoteDataSource) {
        return new Repository(remoteDataSource);
    }
}
