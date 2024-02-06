package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
@Entity
@Table
@Data
public class Reader {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String surname;
    private Date dateOfBirth;

}
