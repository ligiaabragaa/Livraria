package com.example.livraria.servicies.interfaces;

import com.example.livraria.model.entities.Cartao;

import java.util.List;

public interface CartaoService {

    public List<Cartao> listaCartao();
    public Cartao novo(Cartao cartao);
    public Void deletar (long id);
}
