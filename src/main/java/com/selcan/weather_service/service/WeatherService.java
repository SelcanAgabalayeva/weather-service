package com.selcan.weather_service.service;

import com.selcan.weather_service.dto.WeatherResponseDto;

public interface WeatherService {
    WeatherResponseDto getWeather(String cityName);
}
