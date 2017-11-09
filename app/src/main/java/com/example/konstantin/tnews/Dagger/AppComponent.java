package com.example.konstantin.tnews.Dagger;

import com.example.konstantin.tnews.Model.DataManager;
import com.example.konstantin.tnews.Model.RESTDataProvider;
import com.example.konstantin.tnews.Presenters.NewsDetailsPresenter;
import com.example.konstantin.tnews.Presenters.NewsListPresenter;
import com.example.konstantin.tnews.UI.NewsDetailsFragment.NewsDetailsFragment;
import com.example.konstantin.tnews.UI.NewsListFragment.NewsListFragment;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Konstantin on 09.11.2017.
 */

@Singleton
@Component(modules = {UtilsModule.class, DataProvidersModule.class, PresentersModule.class})
public interface AppComponent {
    void inject(DataManager dataManager);
    void inject(RESTDataProvider restDataProvider);

    void inject(NewsDetailsPresenter newsDetailsPresenter);
    void inject(NewsListPresenter newsListPresenter);

    void inject(NewsListFragment newsListFragment);
    void inject(NewsDetailsFragment newsDetailsFragment);
}
