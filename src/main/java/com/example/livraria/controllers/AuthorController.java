package com.example.livraria.controllers;

import com.example.livraria.model.entities.Author;
import com.example.livraria.servicies.interfaces.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/author")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @GetMapping
    public ResponseEntity<List<Author>> listaAutores(){
        List <Author> lista = authorService.listaAutores();
        return ResponseEntity.status(HttpStatus.OK).body(lista);
    }

    @PostMapping
    public ResponseEntity <Author> novo(@RequestBody Author author){
        author = authorService.novo(author);
        return ResponseEntity.status(HttpStatus.OK).body(author);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity <Void> deletar(@PathVariable long id){
        authorService.deletar(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
