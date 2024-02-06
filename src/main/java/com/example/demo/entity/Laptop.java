package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Table
@Data
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String model;
    private BigDecimal price;
    @Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] LaptopPhoto;


}
