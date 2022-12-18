package com.example.livraria.servicies;
import com.example.livraria.model.entities.Book;
import com.example.livraria.repositories.BookRepository;
import com.example.livraria.servicies.interfaces.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImple implements BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> listaBook() {
        List<Book> lista= bookRepository.findAll();
        return lista;
    }

    public Book novo(Book book) {
        return bookRepository.save(book);
    }

    public Void deletar (long id){
        bookRepository.deleteById(id);
        return null;
    }
}
