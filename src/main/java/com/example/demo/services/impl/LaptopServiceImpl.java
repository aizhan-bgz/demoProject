package com.example.demo.services.impl;

import com.example.demo.entity.Laptop;
import com.example.demo.repo.LaptopRepo;
import com.example.demo.services.LaptopService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LaptopServiceImpl implements LaptopService {
    private final LaptopRepo repo;
    @Override
    public List<Laptop> findAll() {
        return repo.findAll();
    }

    @Override
    public List<Laptop> findByName(String name) {
        return repo.findByName(name);
    }

    @Override
    public void save(Laptop l) {
        Laptop laptop = new Laptop();
        laptop.setName(l.getName());
        laptop.setModel(l.getModel());
        laptop.setPrice(l.getPrice());
        laptop.setLaptopPhoto(l.getLaptopPhoto());
        repo.save(laptop);
    }

    @Override
    public Laptop getById(int id) {
        return repo.findById(id).get();
    }

    @Override
    public void delete(int id) {
        repo.deleteById(id);
    }
}
