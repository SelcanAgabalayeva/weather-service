package com.selcan.weather_service.repository;


import com.selcan.weather_service.entity.CurrentWeather;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CurrentWeatherRepository extends JpaRepository<CurrentWeather,Integer> {
    Optional<CurrentWeather> findTopByCityIdOrderByRecordedAtDesc(Integer cityId);
}
