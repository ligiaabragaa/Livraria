package com.example.livraria.controllers;

import com.example.livraria.model.entities.Cartao;
import com.example.livraria.model.entities.Loan;
import com.example.livraria.servicies.interfaces.CartaoService;
import com.example.livraria.servicies.interfaces.LoanService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class LoanController {

    private LoanService loanService;

    @GetMapping
    public ResponseEntity<List<Loan>> listaLoan(){
        List <Loan> lista = loanService.listaLoan();
        return ResponseEntity.status(HttpStatus.OK).body(lista);
    }

    @PostMapping
    public ResponseEntity <Loan> novo(@RequestBody Loan loan){
        loan = loanService.novo(loan);
        return ResponseEntity.status(HttpStatus.OK).body(loan);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity <Void> deletar(@PathVariable long id){
        loanService.deletar(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
