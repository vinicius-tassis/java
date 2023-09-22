package br.com.vta.eventoprogramado;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class EventoProgramadoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventoProgramadoApplication.class, args);
		System.out.println("Referências");
		System.out.println("https://receitasdecodigo.com.br/spring-boot/@scheduled-cron-expression");
		System.out.println("https://receitasdecodigo.com.br/java/o-basico-sobre-cron-expression");
		System.out.println("https://www.baeldung.com/cron-expressions");
	}

}
