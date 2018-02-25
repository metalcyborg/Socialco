package com.metalcyborg.socialco.utils;

import io.reactivex.Scheduler;

/**
 * Created by cyborg on 25.02.2018.
 */
public interface IRxUtils {

    Scheduler getMainThreadScheduler();

    Scheduler getIOScheduler();

    Scheduler getComputationScheduler();
}
