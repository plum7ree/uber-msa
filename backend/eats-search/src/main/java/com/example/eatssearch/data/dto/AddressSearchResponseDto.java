package com.example.eatssearch.data.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AddressSearchResponseDto {
    String name;
    String osmId;
    Float lon;
    Float lat;
}