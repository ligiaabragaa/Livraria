package com.example.livraria.servicies.interfaces;
import com.example.livraria.model.entities.Book;
import com.example.livraria.model.entities.Cliente;
import com.example.livraria.model.entities.Loan;
import java.util.List;

public interface LoanService {

    public List<Loan> listaLoan();
    public Loan novo(Loan loan);
    public Void deletar (long id);
}
