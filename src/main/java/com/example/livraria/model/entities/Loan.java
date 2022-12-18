package com.example.livraria.model.entities;

import javax.persistence.*;
import javax.validation.constraints.Min;
import java.time.LocalDate;

public class Loan {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalDate startDate;
    private LocalDate endDate;
    @Min(value = 0)
    private Double cost;
    private Boolean status;
    @OneToOne
    @JoinColumn(name = "book_id")
    private Book book;

    @OneToOne
    @JoinColumn(name = "client_id")
    private Cliente cliente;

    public Loan(LocalDate startDate, LocalDate endDate, Double cost, Boolean status, Book book, Cliente cliente) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.cost = cost;
        this.status = status;
        this.book = book;
        this.cliente = cliente;
    }
}
