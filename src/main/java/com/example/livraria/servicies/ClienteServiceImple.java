package com.example.livraria.servicies;

import com.example.livraria.model.entities.Author;
import com.example.livraria.model.entities.Cliente;
import com.example.livraria.repositories.AuthorRepository;
import com.example.livraria.repositories.ClienteRepository;
import com.example.livraria.servicies.interfaces.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImple implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;
    public List<Cliente> listaCliente() {
        List<Cliente> lista= clienteRepository.findAll();
        return lista;
    }

    public Cliente novo(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public Void deletar (long id){
        clienteRepository.deleteById(id);
        return null;
    }
}
