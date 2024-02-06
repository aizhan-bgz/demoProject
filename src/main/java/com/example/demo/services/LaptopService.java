package com.example.demo.services;

import com.example.demo.entity.Laptop;
import java.util.List;

public interface LaptopService {
    List<Laptop> findAll ();

    List<Laptop> findByName (String name);

    void save(Laptop laptop);

    Laptop getById (int id);

    void delete(int id);
}
