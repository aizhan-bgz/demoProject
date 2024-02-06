package com.example.demo.services;

import com.example.demo.entity.Book;
import java.util.List;

public interface BookService {

    List<Book> findAll ();

    List<Book> findByReaderName (String name);

    void saveBook(Book bookRequest);

    Book getBookById (int id);

    void deleteBook(int id);

}
