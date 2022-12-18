package com.example.livraria.model.entities;

import com.example.livraria.model.enums.TypeCard;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cartao")
public class Cartao implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String number;
    private Double limiteConta;
    private Double curretLimit;
    private TypeCard typecard;

    @JsonIgnore
    @OneToOne(mappedBy = "cartao")
    private Cliente cliente;
}
