package com.metalcyborg.socialco;

/**
 * Created by cyborg on 25.02.2018.
 */
public interface BasePresenter<V> {

    void onAttach(V view);

    void onDetach(V view);
}
