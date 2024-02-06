package com.example.demo.services.impl;

import com.example.demo.entity.Reader;
import com.example.demo.dto.ReaderResponseDto;
import com.example.demo.dto.ReaderSaveDto;
import com.example.demo.repo.ReaderRepo;
import com.example.demo.services.ReaderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor  // вместо конструктора с @Autowired
// @Component
public class ReaderServiceImpl implements ReaderService {
    private final ReaderRepo repo;

    public List<Reader> getAll (){
        return repo.findAll();
    }

    public Integer save(ReaderSaveDto model){
        Reader reader = new Reader();
        reader.setName(model.getName());
        reader.setSurname(model.getSurname());
        reader.setDateOfBirth(model.getDateOfBirth());
        return repo.save(reader).getId();
    }

    public Integer saveParam(String name, String surname, Date dateOfBirth){
        var model = new ReaderSaveDto(name, surname, dateOfBirth);
        return save(model);
    }

    public List<Reader> getAllByName (String name){
        return repo.findByName(name);
    }

    public ReaderResponseDto getByNameAndSurname (String name, String surname){
        var reader = repo.findByNameAndSurname(name, surname);
        ReaderResponseDto model = new ReaderResponseDto();
        model.setName(reader.getName());
        model.setSurname(reader.getSurname());
        return model;
    }

}
