package com.example.livraria.controllers;

import com.example.livraria.model.entities.Book;
import com.example.livraria.model.entities.Cartao;
import com.example.livraria.servicies.interfaces.CartaoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cartao")
public class CartaoController {

    private CartaoService cartaoService;

    @GetMapping
    public ResponseEntity<List<Cartao>> listaCartao(){
        List <Cartao> lista = cartaoService.listaCartao();
        return ResponseEntity.status(HttpStatus.OK).body(lista);
    }

    @PostMapping
    public ResponseEntity <Cartao> novo(@RequestBody Cartao cartao){
        cartao = cartaoService.novo(cartao);
        return ResponseEntity.status(HttpStatus.OK).body(cartao);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity <Void> deletar(@PathVariable long id){
        cartaoService.deletar(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
