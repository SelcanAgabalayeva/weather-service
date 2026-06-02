package com.selcan.weather_service.repository;

import com.selcan.weather_service.entity.HourlyData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HourlyDataRepository extends JpaRepository<HourlyData,Integer> {
    List<HourlyData> findByCityIdOrderByHourLabel(Integer cityId);
}