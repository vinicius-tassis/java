package br.com.vta.eventoprogramado;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class EventoComCron {

    // Executa a cada 10 segundos
    @Scheduled(cron = "0/10 * * * * *")
    public void executar() {
        System.out.println("Executou o Scheduled com cron");
    }
    
}
