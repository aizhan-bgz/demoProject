package com.example.demo.services;

import com.example.demo.dto.ReaderResponseDto;
import com.example.demo.dto.ReaderSaveDto;
import com.example.demo.entity.Reader;

import java.util.Date;
import java.util.List;

public interface ReaderService {

    List<Reader> getAll ();

    Integer save(ReaderSaveDto model);
    Integer saveParam(String name, String surname, Date dateOfBirth);

    List<Reader> getAllByName (String name);

    ReaderResponseDto getByNameAndSurname (String name, String surname);

}
