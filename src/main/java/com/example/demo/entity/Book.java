package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
@Entity
@Table  //(name = "books")
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

 //   @Column(length = 30)
    private String bookName;
    private String authorName;
    private Date publishDate;

    @ManyToOne()
    private Reader reader;

    @Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] bookPhoto;
}
