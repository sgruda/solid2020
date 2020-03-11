package pl.zzpj2020.solid.dip.weathertracker.solution;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class WeatherTracker {
    String currentConditions;
    WeatherAlertGenerator alertGenerator;

    public void setCurrentConditions(String weatherDescription) {
        this.currentConditions = weatherDescription;
        if (weatherDescription.equalsIgnoreCase("rainy") || weatherDescription.equalsIgnoreCase("sunny")) {
            String alert = alertGenerator.generateWeatherAlert(weatherDescription);
            System.out.print(alert);
        }
    }
}
