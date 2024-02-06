package com.example.demo.controller;

import com.example.demo.entity.Book;
import com.example.demo.services.impl.BookServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
@RequiredArgsConstructor
public class BookController {

    private final BookServiceImpl bookService;

    @GetMapping
    public List<Book> getAll (){
        return bookService.findAll();
    }

    @GetMapping("/reader/{name}")
    public List<Book> getAllBooksByReadersName (@PathVariable String name){
        return bookService.findByReaderName(name);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById (@PathVariable Integer id){
        Book book = bookService.getBookById(id);
        return ResponseEntity.ok(book);
    }

    @PostMapping
    public ResponseEntity<String> saveBook(@RequestBody Book bookRequest) {
        bookService.saveBook(bookRequest);
        return ResponseEntity.ok("Book saved successfully!");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteBook(@PathVariable int id) {
        bookService.deleteBook(id);
        return ResponseEntity.ok("Book deleted successfully!");
    }



}
