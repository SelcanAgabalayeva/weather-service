package com.selcan.weather_service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CurrentWeatherDto {
    private BigDecimal temperature;
    private BigDecimal feelsLike;
    private BigDecimal windSpeed;
    private String windDirection;
    private Integer pressure;
    private Integer humidity;
    private BigDecimal uvIndex;
    private BigDecimal visibilityKm;
    private String visibilityCondition;
    private BigDecimal dewPoint;
    private LocalTime sunriseTime;
    private LocalTime sunsetTime;
    private String weatherDescription;
    private String weatherIcon;
    private LocalDateTime recordedAt;
}
