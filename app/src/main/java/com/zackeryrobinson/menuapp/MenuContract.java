package com.zackeryrobinson.menuapp;

/**
 * Created by Zack on 11/30/2017.
 */

public interface MenuContract {
    interface View extends BaseView {

    }

    interface Presenter extends BasePresenter{

    }

    void attachView();
    void detachView();


}
