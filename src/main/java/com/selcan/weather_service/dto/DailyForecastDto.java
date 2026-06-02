package com.selcan.weather_service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DailyForecastDto {
    private String dayName;
    private BigDecimal temperature;
    private String weatherDescription;
    private String weatherIcon;
    private LocalDate forecastDate;
}
