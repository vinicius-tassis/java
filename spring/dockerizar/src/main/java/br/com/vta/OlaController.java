package br.com.vta;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OlaController {

    @GetMapping("/ola")
    public String getMessage() {
        return "Olá do Docker!";
    }
}