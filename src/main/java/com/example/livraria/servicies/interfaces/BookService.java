package com.example.livraria.servicies.interfaces;

import com.example.livraria.model.entities.Book;

import java.util.List;

public interface BookService {

    public List<Book> listaBook();
    public Book novo(Book book);

    public Void deletar (long id);
}
