package com.example.projectplus.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class HealthcheckDto {
    private boolean status;
    private String message;
}


