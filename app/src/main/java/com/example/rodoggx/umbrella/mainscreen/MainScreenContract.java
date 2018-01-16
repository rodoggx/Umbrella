package com.example.rodoggx.umbrella.mainscreen;

import com.example.rodoggx.umbrella.data.Weather;

import java.util.List;

/**
 *
 */

public class MainScreenContract {
    interface View {
        void showWeather(List<Weather> weatherList);
        void showError(String message);
        void showComplete();
    }

    interface Presenter {
        void loadweather();
    }
}
