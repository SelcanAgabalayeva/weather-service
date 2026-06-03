package com.selcan.weather_service.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CityDto {
    @Schema(example = "Dhaka")
    private String name;
    @Schema(example = "BD")
    private String countryCode;
    @Schema(example = "Bangladesh")
    private String countryName;
}
