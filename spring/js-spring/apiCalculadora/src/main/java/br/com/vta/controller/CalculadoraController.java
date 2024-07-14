package br.com.vta.controller;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class CalculadoraController {

    @GetMapping("calculadora/soma")
    public int somar(@RequestParam int numero1, @RequestParam int numero2) {
        return numero1 + numero2;
    }
    
}
