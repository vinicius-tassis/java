package br.com.vta.controller;

import org.springframework.web.bind.annotation.RestController;

import br.com.vta.model.Mensagem;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class MessageControler {
    
    // @CrossOrigin(origins = "http://localhost")
    
    @GetMapping("api/mensagem")
    public Mensagem dizerOla(@RequestParam String nome) {
        return new Mensagem(nome, "olá " + nome);
    }

    @GetMapping("api/teste")
    public ResponseEntity<String> dizerOlaTeste(@RequestParam String nome) {
        String mensagem = "Olá, " + nome + "!";
        return ResponseEntity.ok(mensagem);
    }
    
}
