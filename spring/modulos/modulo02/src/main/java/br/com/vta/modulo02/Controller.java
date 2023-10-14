package br.com.vta.modulo02;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {
    
    @GetMapping("/ola")
    public ResponseEntity<String> dizerOla() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Custom-Header", "Módulo 02");
        
        return new ResponseEntity<>("Olá, sou o módulo 02 ", headers, HttpStatus.OK);
    }
}
