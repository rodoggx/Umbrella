package com.example.rodoggx.umbrella.mainscreen;

import com.example.rodoggx.umbrella.data.component.NetComponent;
import com.example.rodoggx.umbrella.util.CustomScope;

import dagger.Component;

/**
 * MainScreenComponent Interface injects activity into the MainScreenModule
 */

@CustomScope
@Component(dependencies = NetComponent.class, modules = MainScreenModule.class)
public interface MainScreenComponent {
    void inject(MainActivity activity);
}
