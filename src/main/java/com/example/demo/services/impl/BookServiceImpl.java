package com.example.demo.services.impl;

import com.example.demo.entity.Book;
import com.example.demo.repo.BookRepo;
import com.example.demo.services.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepo bookRepo;

    public List<Book> findAll (){
        return bookRepo.findAll();
    }

    @Override
    public List<Book> findByReaderName(String name) {
        return null;
    }

    public void saveBook(Book bookRequest) {
        Book book = new Book();
        book.setBookName(bookRequest.getBookName());
        book.setAuthorName(bookRequest.getAuthorName());
        book.setPublishDate(new Date());
        book.setBookPhoto(bookRequest.getBookPhoto());
        bookRepo.save(book);
    }

    @Override
    public Book getBookById(int id) {
        return bookRepo.findById(id).get();
    }

    public void deleteBook(int id) {
        bookRepo.deleteById(id);
    }


}
