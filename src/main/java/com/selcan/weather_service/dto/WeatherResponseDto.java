package com.selcan.weather_service.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WeatherResponseDto {
    @Schema(example = "true")
    private boolean success;
    @Schema(example = "OK")
    private String message;
    private DataDto data;
}
