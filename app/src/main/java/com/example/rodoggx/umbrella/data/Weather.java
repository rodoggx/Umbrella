package com.example.rodoggx.umbrella.data;

import java.net.URL;

/**
 * POJO class of weather data
 */

public class Weather {
    private final String full;
    private final String zip;
    private final String weather;
    private final String temp_f;
    private final String temp_c;
    private final URL forecast_url;
    private final URL history_url;

    public Weather(String full, String zip, String weather, String temp_f, String temp_c, URL forecast_url, URL history_url) {
        this.full = full;
        this.zip = zip;
        this.weather = weather;
        this.temp_f = temp_f;
        this.temp_c = temp_c;
        this.forecast_url = forecast_url;
        this.history_url = history_url;
    }

    public String getFull() {
        return full;
    }

    public String getZip() {
        return zip;
    }

    public String getWeather() {
        return weather;
    }

    public String getTemp_f() {
        return temp_f;
    }

    public String getTemp_c() {
        return temp_c;
    }

    public URL getForecast_url() {
        return forecast_url;
    }

    public URL getHistory_url() {
        return history_url;
    }
}
