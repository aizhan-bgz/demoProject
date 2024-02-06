package com.example.demo.repo;

import com.example.demo.entity.Reader;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReaderRepo extends JpaRepository<Reader, Integer> {

    List<Reader> findByName (String name);
    Reader findByNameAndSurname (String name, String surname);


}
