package br.com.vta;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
// import org.slf4j.*;

@RestController
public class OlaController {
    // private static final Logger Logger = LoggerFactory.getLogger(OlaController.class);

    @GetMapping("/ola")
    public String comprimentar(@RequestParam String nome) {
        // Logger.info("Log do nome:  " + nome);
        return ("Ola " + nome);
    }
    
}
