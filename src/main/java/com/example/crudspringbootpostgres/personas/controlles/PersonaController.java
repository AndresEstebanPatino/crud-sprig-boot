package com.example.crudspringbootpostgres.personas.controlles;

import com.example.crudspringbootpostgres.personas.domain.models.Personas;
import com.example.crudspringbootpostgres.personas.domain.services.PersonasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/personas")

public class PersonaController {
//Esta es la cuarta etapa
	private final PersonasService personasService;
	@Autowired
	public PersonaController(PersonasService personasService){

		this.personasService = personasService;
	}

	@GetMapping
	public List<Personas> getPersonasController(){

		return personasService.getPersonas();
	}

	@PostMapping
	public void crearPersona(@RequestBody Personas persona){

		this.personasService.newPersona(persona);
	}

	@PutMapping("/{id}")
	public void actualizaPersona(@PathVariable Integer id, @RequestBody Personas persona){
		this.personasService.actualizar(id, persona);
	}

	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable Integer id, Personas persona){
		 this.personasService.deletePersona(id, persona);
	}


    //Esta es la tercera etapa
	/*@GetMapping
	public List<Personas> getPersonas(){
		return List.of(
				new Personas(
						1,
						"Adres",
						"Patiño",
						24,
						LocalDate.of(2023, Month.AUGUST, 12)
				)
		);
	} */

}
