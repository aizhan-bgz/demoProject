package com.example.demo.dto;

import lombok.Data;

import java.util.Date;
@Data
public class ReaderSaveDto {
    private Integer id;
    private String name;
    private String surname;
    private Date dateOfBirth;

    public ReaderSaveDto(String name, String surname, Date dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }
}
