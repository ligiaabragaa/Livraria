package com.example.livraria.repositories;

import com.example.livraria.model.entities.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository extends JpaRepository<Loan, Long>{

}

