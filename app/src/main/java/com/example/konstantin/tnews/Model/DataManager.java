package com.example.konstantin.tnews.Model;

import com.example.konstantin.tnews.Dagger.DependencyInjector;

import javax.inject.Inject;

/**
 * Created by Konstantin on 09.11.2017.
 */

public class DataManager {

    @Inject RESTDataProvider restDataProvider;
    @Inject CacheHelper cacheHelper;

    public DataManager() {
        DependencyInjector.getComponent().inject(this);
    }


}
