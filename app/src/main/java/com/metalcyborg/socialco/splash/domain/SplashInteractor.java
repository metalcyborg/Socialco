package com.metalcyborg.socialco.splash.domain;

import io.reactivex.Single;

/**
 * Created by cyborg on 25.02.2018.
 */
public interface SplashInteractor {

    Single<Boolean> makeLongOperation();
}
