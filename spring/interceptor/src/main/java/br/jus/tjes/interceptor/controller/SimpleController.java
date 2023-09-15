package br.jus.tjes.interceptor.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.jus.tjes.interceptor.model.Data;

@RestController
public class SimpleController {
    
    @GetMapping("")
    public ResponseEntity<Data> test() {
        Data data = new Data();
        data.setInformation("Test information");

        return ResponseEntity.ok()
                .header("Custom-Header", "Test Header")
                .body(data);
    }

}
