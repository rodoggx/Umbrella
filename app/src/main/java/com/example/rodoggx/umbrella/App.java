package com.example.rodoggx.umbrella;

import android.app.Application;

import com.example.rodoggx.umbrella.data.component.DaggerNetComponent;
import com.example.rodoggx.umbrella.data.component.NetComponent;
import com.example.rodoggx.umbrella.data.module.AppModule;
import com.example.rodoggx.umbrella.data.module.NetModule;

/**
 * Application class to handle the app initial instantiation
 */

public class App extends Application {
    private NetComponent netComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        netComponent = DaggerNetComponent.builder()
                .appModule(new AppModule(this))
                .netModule(new NetModule("http://api.wunderground.com/api/48bc577a58668eeb/conditions/q/GA/Atlanta.json"))
                .build();
    }

    public NetComponent getNetComponent() {
        return netComponent;
    }
}
