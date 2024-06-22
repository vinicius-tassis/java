package br.com.vta.springVueTeste;

import org.springframework.web.bind.annotation.CrossOrigin;
// import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class Controller {

    @CrossOrigin
    @GetMapping("/api-ola")
    public ResponseEntity<Mensagem> dizerOla() {
        Mensagem mensagem = new Mensagem("Olá do docker!\nNoVo TeStE!");
        return ResponseEntity.ok(mensagem);
    }
    
}
