package br.com.vta.accessingdatajpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.com.vta.accessingdatajpa.repository.CustomerRepository;
import br.com.vta.accessingdatajpa.model.Customer;

@SpringBootApplication
public class AccessingDataJpaApplication {
	private static final Logger log = LoggerFactory.getLogger(AccessingDataJpaApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(AccessingDataJpaApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(CustomerRepository repository) {
		return (args) -> {
			// save a few customers
			repository.save(new Customer("João", "Silva", 45));
			repository.save(new Customer("Marta", "Pereira", 87));
			repository.save(new Customer("Ana", "Silva", 13));
			repository.save(new Customer("David", "Santos", 23));
			repository.save(new Customer("Michelle", "Souza", 2));

			// fetch all customers
			log.info("Customers found with findAll():");
			log.info("-------------------------------");
			for (Customer customer : repository.findAll()) {
				log.info(customer.toString());
			}
			log.info("");

			// fetch an individual customer by ID
			Customer customer = repository.findById(1L);
			log.info("Customer found with findById(1L):");
			log.info("--------------------------------");
			log.info(customer.toString());
			log.info("");

			// fetch customers by last name
			log.info("Customer found with findByLastName('Silva'):");
			log.info("--------------------------------------------");
			repository.findByLastName("Silva").forEach(bauer -> {
				log.info(bauer.toString());
			});

			// fetch customers by last name
			log.info("Customer found with age(13):");
			log.info("--------------------------------------------");
			for (Customer customerAge : repository.findByAge(13)) {
				log.info(customerAge.toString());
			}
			// for (Customer bauer : repository.findByLastName("Bauer")) {
			// 	log.info(bauer.toString());
			// }
			log.info("");
		};
	}

}
