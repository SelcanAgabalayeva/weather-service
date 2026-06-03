package com.selcan.weather_service.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "daily_forecast")
public class DailyForecast {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;
    @Column(name = "forecast_date")
    private LocalDate forecastDate;
    @Column(name = "day_name")
    private String dayName;
    private BigDecimal temperature;
    @Column(name = "weather_description")
    private String weatherDescription;
    @Column(name = "weather_icon")
    private String weatherIcon;
}