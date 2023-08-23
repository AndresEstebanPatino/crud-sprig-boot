package com.example.crudspringbootpostgres;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class CrudSpringBootPostgresApplication {

	public static void main(String[] args) {

		SpringApplication.run(CrudSpringBootPostgresApplication.class, args);
	}


    //Esta es la segunda etapa
	// @GetMapping(path = "/")
	/*public List<Personas> getName(){
		return List.of(
				new Personas(
						1,
						"Adres",
						"Patiño",
						24,
						LocalDate.of(2023, Month.AUGUST, 12)
				)
		);
	}
	/*


	 */


	//Esta es la primera prueba que sehace con un objeto hardcodeado o la primera etapa
	/*public List<String> getName(){
		return List.of(
				"Andrés",
				"mamuela",
				"pipe"
		);
	}*/
}
