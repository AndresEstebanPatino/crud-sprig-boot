package com.example.crudspringbootpostgres.personas.domain.services;

import com.example.crudspringbootpostgres.personas.infra.repositories.PersonasRepository;
import com.example.crudspringbootpostgres.personas.domain.models.Personas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class PersonasService {

    private final PersonasRepository personasRepository;
   @Autowired

    public PersonasService(PersonasRepository personasRepository) {

       this.personasRepository = personasRepository;
    }

    public List<Personas> getPersonas(){

       return this.personasRepository.findAll();
    }

    public void newPersona(@RequestBody Personas persona) {

       personasRepository.save(persona);
    }

    public void actualizar(Integer id, Personas persona) {

       Optional<Personas> optionalPersonas = personasRepository.findById(id);

        if (optionalPersonas.isPresent()){
            Personas personaExistente = optionalPersonas.get();

            personaExistente.setName(persona.getName());
            personaExistente.setLastName(persona.getLastName());
            personaExistente.setAge(persona.getAge());
            persona.setDate(persona.getDate());

            personasRepository.save(personaExistente);
        }

    }

    public void deletePersona(Integer id, Personas persona){
       boolean existe = this.personasRepository.existsById(id);
        if (existe) {
            personasRepository.delete(persona);
        }
    }


    //Esto se mutea después de crear el constructor de la inyección de dependencias DE LA INTERFACE

   /* public List<Personas> getPersonas(){
        return List.of(
                new Personas(
                        1,
                        "Andres",
                        "Patiño",
                        24,
                        LocalDate.of(2023, Month.AUGUST, 12)
                )
        );
    } */
}
