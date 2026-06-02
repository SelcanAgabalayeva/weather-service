package com.selcan.weather_service.service.impls;
import com.selcan.weather_service.dto.*;
import com.selcan.weather_service.entity.City;
import com.selcan.weather_service.entity.CurrentWeather;
import com.selcan.weather_service.entity.DailyForecast;
import com.selcan.weather_service.entity.HourlyData;
import com.selcan.weather_service.repository.CityRepository;
import com.selcan.weather_service.repository.CurrentWeatherRepository;
import com.selcan.weather_service.repository.DailyForecastRepository;
import com.selcan.weather_service.repository.HourlyDataRepository;
import com.selcan.weather_service.service.WeatherService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@Service
@RequiredArgsConstructor
public class WeatherServiceImpl implements WeatherService {

    private final CityRepository cityRepository;
    private final CurrentWeatherRepository currentWeatherRepository;
    private final DailyForecastRepository dailyForecastRepository;
    private final HourlyDataRepository hourlyDataRepository;
    private final ModelMapper modelMapper;

    @Override
    public WeatherResponseDto getWeather(String cityName) {

        City city = cityRepository.findByNameIgnoreCase(cityName).orElseThrow(() -> new ResponseStatusException(NOT_FOUND, "City not found"));

        CurrentWeather currentWeather = currentWeatherRepository.findTopByCityIdOrderByRecordedAtDesc(city.getId()).orElseThrow(() -> new ResponseStatusException(NOT_FOUND, "Weather not found"));

        List<DailyForecast> forecasts = dailyForecastRepository.findByCityIdOrderByForecastDate(city.getId());

        List<HourlyData> hourlyData = hourlyDataRepository.findByCityIdOrderByHourLabel(city.getId());

        DataDto data = DataDto.builder().city(modelMapper.map(city, CityDto.class)).current(modelMapper.map(currentWeather, CurrentWeatherDto.class))
                .weeklyForecast(
                        forecasts.stream()
                                .map(f -> modelMapper.map(f, DailyForecastDto.class))
                                .toList()
                )
                .hourly(
                        hourlyData.stream()
                                .map(h -> modelMapper.map(h, HourlyDataDto.class))
                                .toList()
                )
                .build();

        return WeatherResponseDto.builder()
                .success(true)
                .message("OK")
                .data(data)
                .build();
    }
}
