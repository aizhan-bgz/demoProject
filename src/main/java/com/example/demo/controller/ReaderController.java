package com.example.demo.controller;

import com.example.demo.entity.Reader;
import com.example.demo.dto.ReaderResponseDto;
import com.example.demo.dto.ReaderSaveDto;
import com.example.demo.services.impl.ReaderServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
@RestController
@RequestMapping("/readers")
@RequiredArgsConstructor
public class ReaderController {

    private final ReaderServiceImpl service;

    @GetMapping
    public List<Reader> getAll (){
        return service.getAll();
    }

    @PostMapping
    public Integer save(@RequestBody ReaderSaveDto model){
        return service.save(model);
    }
    @PostMapping("/saveParam")
    public Integer saveReader(@RequestParam String name,
                              @RequestParam String surname,
                              @RequestParam Date dateOfBirth){
        return service.saveParam(name, surname, dateOfBirth);
    }


    @GetMapping("/{name}")
    public List<Reader> getAllByName (@PathVariable String name){
        return service.getAllByName(name);
    }

    @GetMapping("/{name}/{surname}")
    public ReaderResponseDto getByNameAndSurname (@PathVariable String name,
                                                  @PathVariable String surname){
        return service.getByNameAndSurname(name, surname);
    }


}

