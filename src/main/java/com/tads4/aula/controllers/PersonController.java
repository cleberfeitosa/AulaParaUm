package com.tads4.aula.controllers;


import com.tads4.aula.dto.PersonDTO;
import com.tads4.aula.dto.PersonDepartamentDTO;
import com.tads4.aula.services.PersonService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping (value = "/people")
public class PersonController {

    @Autowired
    private PersonService service;

    //@PostMapping
    public ResponseEntity<PersonDepartamentDTO> insert(@RequestBody PersonDepartamentDTO dto) {
        /*dto = service.insert(dto)
        return  dto;*/
        dto = service.insert(dto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(dto.getId()).toUri();
        return ResponseEntity.created(uri).body(dto);
    }

    @PostMapping
    public ResponseEntity<PersonDTO> insert(@RequestBody PersonDTO dto) {
        /*dto = service.insert(dto)
        return  dto;*/
        dto = service.insert(dto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(dto.getId()).toUri();
        return ResponseEntity.created(uri).body(dto);
    }
}