package com.learning.oops.chapter2;

import com.learning.oops.chapter2.observable.WeatherData;
import com.learning.oops.chapter2.observer.CurrentConditionsDisplay;
import com.learning.oops.chapter2.observer.ForecastPredictionsDisplay;
import com.learning.oops.chapter2.observer.HeatIndexDisplay;
import com.learning.oops.chapter2.observer.StatisticsDisplay;

public class MainDriver {
    public static void main(String[] args) {
        WeatherData weatherData= new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay= new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay= new StatisticsDisplay(weatherData);
        ForecastPredictionsDisplay forecastPredictionsDisplay= new ForecastPredictionsDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay= new HeatIndexDisplay(weatherData);

        // simulating the change in data
        weatherData.setMeasurements(80, 65, 30.4f);

        //remove statistics observer
        statisticsDisplay.unsubscribe(weatherData);
        weatherData.setMeasurements(82, 70, 29.2f);

        //remove heatindex observer
        heatIndexDisplay.unsubscribe(weatherData);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
