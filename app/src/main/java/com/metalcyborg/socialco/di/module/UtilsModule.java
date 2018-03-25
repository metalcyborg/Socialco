package com.metalcyborg.socialco.di.module;

import android.support.annotation.NonNull;

import com.metalcyborg.socialco.utils.IRxUtils;
import com.metalcyborg.socialco.utils.RxUtils;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by cyborg on 25.02.2018.
 */
@Module
public class UtilsModule {

    @Provides
    @NonNull
    @Singleton
    public IRxUtils provideRxUtils() {
        return new RxUtils();
    }
}
