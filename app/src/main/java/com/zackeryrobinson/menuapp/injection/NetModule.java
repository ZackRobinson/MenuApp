package com.zackeryrobinson.menuapp.injection;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Zack on 11/30/2017.
 */

@Module
public class NetModule {
    String mBaseURL;

    // Constructor
    public NetModule(String baseUrl){
        this.mBaseURL = baseUrl;
    }

    @Provides
    @Singleton
    Gson provideGson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        return gsonBuilder.create();
    }

    // This differs from the documentation
    @Provides
    @Singleton
    OkHttpClient provideOkHttpClient (Cache cache){
        OkHttpClient.Builder client = new OkHttpClient.Builder().cache(cache);

        return client.build();
    }


    // Why do we use "m" before mBaseURL
    @Provides
    @Singleton
    Retrofit provideRetrofit(Gson gson, OkHttpClient okHttpClient){
        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create(gson))
                .baseUrl(mBaseURL)
                .client(okHttpClient)
                .build();
        return retrofit;
    }







}
