package com.selcan.weather_service.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Getter
@Setter
@Entity
@Table(name = "current_weather")
public class CurrentWeather {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "city_id")
    private Integer cityId;
    private BigDecimal temperature;
    @Column(name = "feels_like")
    private BigDecimal feelsLike;
    @Column(name = "wind_speed")
    private BigDecimal windSpeed;
    @Column(name = "wind_direction")
    private String windDirection;
    private Integer pressure;
    private Integer humidity;
    @Column(name = "uv_index")
    private BigDecimal uvIndex;
    @Column(name = "visibility_km")
    private BigDecimal visibilityKm;
    @Column(name = "visibility_condition")
    private String visibilityCondition;
    @Column(name = "dew_point")
    private BigDecimal dewPoint;
    @Column(name = "sunrise_time")
    private LocalTime sunriseTime;
    @Column(name = "sunset_time")
    private LocalTime sunsetTime;
    @Column(name = "weather_description")
    private String weatherDescription;
    @Column(name = "weather_icon")
    private String weatherIcon;
    @Column(name = "recorded_at")
    private LocalDateTime recordedAt;
}
