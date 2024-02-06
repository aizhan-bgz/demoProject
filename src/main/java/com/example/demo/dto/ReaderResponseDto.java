package com.example.demo.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ReaderResponseDto {
    private String name;
    private String surname;

    public ReaderResponseDto(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}
