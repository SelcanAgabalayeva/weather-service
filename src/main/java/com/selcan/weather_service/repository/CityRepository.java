package com.selcan.weather_service.repository;

import com.selcan.weather_service.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CityRepository extends JpaRepository<City,Integer> {
    Optional<City> findByNameIgnoreCase(String name);
}
