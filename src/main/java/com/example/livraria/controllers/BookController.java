package com.example.livraria.controllers;

import com.example.livraria.model.entities.Author;
import com.example.livraria.model.entities.Book;
import com.example.livraria.servicies.interfaces.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    private BookService bookService;

    @GetMapping
    public ResponseEntity<List<Book>> listaBook(){
        List <Book> lista = bookService.listaBook();
        return ResponseEntity.status(HttpStatus.OK).body(lista);
    }

    @PostMapping
    public ResponseEntity <Book> novo(@RequestBody Book book){
        book = bookService.novo(book);
        return ResponseEntity.status(HttpStatus.OK).body(book);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity <Void> deletar(@PathVariable long id){
        bookService.deletar(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
