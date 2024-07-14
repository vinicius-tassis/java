package br.com.vta.controller;

import org.springframework.web.bind.annotation.RestController;

import br.com.vta.model.Mensagem;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class MessageControler {
    
    @CrossOrigin(origins = "http://localhost")
    @GetMapping("api/mensagem")
    public Mensagem dizerOla(@RequestParam String nome) {
        return new Mensagem(nome, "olá " + nome);
    }
    
}
