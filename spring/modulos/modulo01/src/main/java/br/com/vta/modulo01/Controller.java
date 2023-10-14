package br.com.vta.modulo01;

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
        headers.add("Custom-Header", "Módulo 01");
        
        return new ResponseEntity<>("Olá, sou o módulo 01 ", headers, HttpStatus.OK);
    }
}
