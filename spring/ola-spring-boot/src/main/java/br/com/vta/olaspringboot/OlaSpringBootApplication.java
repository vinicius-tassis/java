package br.com.vta.olaspringboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OlaSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(OlaSpringBootApplication.class, args);
	}

	/*
	 * O método @Bean com CommandLineRunner é usado para executar código específico quando o aplicativo Spring Boot é inicializado.
	 * Ele é geralmente usado para executar tarefas de inicialização, como preencher o banco de dados com dados iniciais, executar migrações, entre outras ações.
	 * Neste exemplo, o CommandLineRunner é criado como um bean Spring e recebe uma implementação funcional (lambda) que contém o código de inicialização. Quando o aplicativo Spring Boot é iniciado, esse código será executado automaticamente.
	 */
	@Bean
	public CommandLineRunner metodoInicial() {
		return (args) -> {
			System.out.println("Spring iniciou");
			System.out.println("O método @Bean com CommandLineRunner é usado para executar código específico quando o aplicativo Spring Boot é inicializado. Ele é geralmente usado para executar tarefas de inicialização, como preencher o banco de dados com dados iniciais, executar migrações, entre outras ações.");
			System.out.println("Neste exemplo, o CommandLineRunner é criado como um bean Spring e recebe uma implementação funcional (lambda) que contém o código de inicialização. Quando o aplicativo Spring Boot é iniciado, esse código será executado automaticamente.");


		};
	}
}
