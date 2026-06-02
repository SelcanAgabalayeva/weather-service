package com.selcan.weather_service.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class HourlyDataDto {
    private String hourLabel;
    private BigDecimal windSpeed;
    private Integer rainProbability;
    private String rainCondition;
}
