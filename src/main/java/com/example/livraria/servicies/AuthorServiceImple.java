package com.example.livraria.servicies;

import com.example.livraria.model.entities.Author;
import com.example.livraria.repositories.AuthorRepository;
import com.example.livraria.servicies.interfaces.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImple implements AuthorService {
    @Autowired
    private AuthorRepository authorRepository;
    public List<Author> listaAutores() {
        List<Author> lista= authorRepository.findAll();
        return lista;
    }

    public Author novo(Author author) {
        return authorRepository.save(author);
    }

    public Void deletar (long id){
        authorRepository.deleteById(id);
        return null;
    }
    }

