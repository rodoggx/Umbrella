package com.example.rodoggx.umbrella.mainscreen;

import com.example.rodoggx.umbrella.util.CustomScope;

import dagger.Module;
import dagger.Provides;

/**
 * MainScreenModule provides the view to the presenter is injected
 */

@Module
public class MainScreenModule {
    private final MainScreenContract.View view;

    public MainScreenModule(MainScreenContract.View view) {
        this.view = view;
    }

    @Provides
    @CustomScope
    MainScreenContract.View providesMainScreenContractView() {
        return view;
    }
}
