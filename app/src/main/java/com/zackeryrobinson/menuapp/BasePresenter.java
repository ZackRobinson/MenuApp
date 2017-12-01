package com.zackeryrobinson.menuapp;

/**
 * Created by Zack on 11/30/2017.
 */

public interface BasePresenter<V extends BaseView> {
    void attachView();
    void detachView(V view);

}
