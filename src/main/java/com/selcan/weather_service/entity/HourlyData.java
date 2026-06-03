package com.selcan.weather_service.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "hourly_data")
public class HourlyData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;
    @Column(name = "hour_label")
    private String hourLabel;
    @Column(name = "wind_speed")
    private BigDecimal windSpeed;
    @Column(name = "rain_probability")
    private Integer rainProbability;
    @Column(name = "rain_condition")
    private String rainCondition;
    @Column(name = "recorded_at")
    private LocalDateTime recordedAt;
}
