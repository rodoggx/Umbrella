package com.example.rodoggx.umbrella.data.component;

import com.example.rodoggx.umbrella.data.module.AppModule;
import com.example.rodoggx.umbrella.data.module.NetModule;

import javax.inject.Singleton;

import dagger.Component;
import retrofit2.Retrofit;

/**
 * NetComponent Interface injects retrofit into the MainScreenComponent
 */
@Singleton
@Component(modules = {AppModule.class, NetModule.class})
public interface NetComponent {
    Retrofit retrofit();
}
