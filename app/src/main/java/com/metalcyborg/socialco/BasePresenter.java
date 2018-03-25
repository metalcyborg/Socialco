package com.metalcyborg.socialco;

/**
 * Created by cyborg on 25.02.2018.
 */
public interface BasePresenter<V> {

    void attachView(V view);

    void detachView();
}
