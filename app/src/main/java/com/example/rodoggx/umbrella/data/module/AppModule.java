package com.example.rodoggx.umbrella.data.module;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 *The AppModule provides the application context for
 * Retrofit and OkHttp libraray
*/

@Module
public class AppModule {
    Application applicatiion;

    public AppModule(Application applicatiion) {
        this.applicatiion = applicatiion;
    }

    @Provides
    @Singleton
    Application provideApplication() {
        return applicatiion;
    }
}
