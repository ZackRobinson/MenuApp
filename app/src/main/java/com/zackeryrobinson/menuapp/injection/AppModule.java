package com.zackeryrobinson.menuapp.injection;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Zack on 11/30/2017.
 */

@Module
public class AppModule {
    Application mApplication;

    public AppModule(Application application){
        mApplication = application;
    }

    @Provides
    @Singleton
    Application providesApplication(){
        return mApplication;
    }

}
