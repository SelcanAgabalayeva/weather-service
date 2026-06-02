package com.selcan.weather_service.repository;

import com.selcan.weather_service.entity.DailyForecast;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DailyForecastRepository extends JpaRepository<DailyForecast,Integer> {
    List<DailyForecast> findByCityIdOrderByForecastDate(Integer cityId);
}
