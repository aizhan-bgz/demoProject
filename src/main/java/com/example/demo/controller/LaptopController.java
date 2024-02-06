package com.example.demo.controller;

import com.example.demo.entity.Laptop;
import com.example.demo.services.impl.LaptopServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/laptop")
@RequiredArgsConstructor
public class LaptopController {
    private final LaptopServiceImpl service;

    @GetMapping
    public List<Laptop> getAll (){
        return service.findAll();
    }

    @GetMapping("/{name}")
    public List<Laptop> findByName (@PathVariable String name){
        return service.findByName(name);
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<Laptop> getById (@PathVariable Integer id){
        Laptop laptop = service.getById(id);
        return ResponseEntity.ok(laptop);
    }

    @PostMapping
    public ResponseEntity<String> save(@RequestBody Laptop laptop) {
        service.save(laptop);
        return ResponseEntity.ok("Laptop saved successfully!");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable int id) {
        service.delete(id);
        return ResponseEntity.ok("Laptop deleted successfully!");
    }


}
