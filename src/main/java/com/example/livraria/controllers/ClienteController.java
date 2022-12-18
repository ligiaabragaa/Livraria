package com.example.livraria.controllers;

import com.example.livraria.model.entities.Book;
import com.example.livraria.model.entities.Cliente;
import com.example.livraria.servicies.interfaces.ClienteService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {


    private ClienteService clienteService;

    @GetMapping
    public ResponseEntity<List<Cliente>> listaCliente(){
        List <Cliente> lista = clienteService.listaCliente();
        return ResponseEntity.status(HttpStatus.OK).body(lista);
    }

    @PostMapping
    public ResponseEntity <Cliente> novo(@RequestBody Cliente cliente){
        cliente = clienteService.novo(cliente);
        return ResponseEntity.status(HttpStatus.OK).body(cliente);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity <Void> deletar(@PathVariable long id){
        clienteService.deletar(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }


}
