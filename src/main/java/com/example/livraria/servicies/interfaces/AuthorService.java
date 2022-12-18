package com.example.livraria.servicies.interfaces;

import com.example.livraria.model.entities.Author;

import java.util.List;

public interface AuthorService {

    public List<Author> listaAutores();
    public Author novo(Author author);

    public Void deletar (long id);


}
