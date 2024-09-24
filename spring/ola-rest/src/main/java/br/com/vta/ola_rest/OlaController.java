package br.com.vta.ola_rest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class OlaController {
    
    @GetMapping("ola")
    public String dizerOla(@RequestParam String nome) {
        return "Olá " + nome;
    }
}
