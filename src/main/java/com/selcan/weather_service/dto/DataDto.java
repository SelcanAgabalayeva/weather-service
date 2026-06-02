package com.selcan.weather_service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DataDto {
    private CityDto city;
    private CurrentWeatherDto current;
    private List<DailyForecastDto> weeklyForecast;
    private List<HourlyDataDto> hourly;
}
