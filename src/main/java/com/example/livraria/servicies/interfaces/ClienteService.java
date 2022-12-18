package com.example.livraria.servicies.interfaces;

import com.example.livraria.model.entities.Cliente;

import java.util.List;

public interface ClienteService {


    public List<Cliente> listaCliente();
    public Cliente novo(Cliente cliente);
    public Void deletar (long id);
}
