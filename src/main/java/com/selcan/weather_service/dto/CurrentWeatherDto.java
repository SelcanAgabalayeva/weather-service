package com.selcan.weather_service.dto;

import io.swagger.v3.oas.annotations.media.Schema;
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
    @Schema(example = "31.5")
    private BigDecimal temperature;
    @Schema(example = "34.2")
    private BigDecimal feelsLike;
    @Schema(example = "12.5")
    private BigDecimal windSpeed;
    @Schema(example = "NW")
    private String windDirection;
    @Schema(example = "1013")
    private Integer pressure;
    @Schema(example = "75")
    private Integer humidity;
    @Schema(example = "6")
    private BigDecimal uvIndex;
    @Schema(example = "10")
    private BigDecimal visibilityKm;
    @Schema(example = "Good")
    private String visibilityCondition;
    @Schema(example = "24.0")
    private BigDecimal dewPoint;
    @Schema(example = "05:18")
    private LocalTime sunriseTime;
    @Schema(example = "18:42")
    private LocalTime sunsetTime;
    @Schema(example = "Partly Cloudy")
    private String weatherDescription;
    @Schema(example = "cloudy.png")
    private String weatherIcon;
    @Schema(example = "2026-06-03T10:00:00")
    private LocalDateTime recordedAt;
}
