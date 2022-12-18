package com.example.livraria.servicies;

import com.example.livraria.model.entities.Cartao;
import com.example.livraria.repositories.CartaoRepository;
import com.example.livraria.servicies.interfaces.CartaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartaoServiceImple implements CartaoService {

    @Autowired
    private CartaoRepository cartaoRepository;
    public List<Cartao> listaCartao() {
        List<Cartao> lista= cartaoRepository.findAll();
        return lista;
    }

    public Cartao novo(Cartao cartao) {
        return cartaoRepository.save(cartao);
    }

    public Void deletar (long id){
       cartaoRepository.deleteById(id);
        return null;
    }
}
