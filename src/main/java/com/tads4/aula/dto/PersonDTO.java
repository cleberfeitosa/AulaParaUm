package com.tads4.aula.dto;

import com.tads4.aula.entities.Person;

public class PersonDTO {

    private Long id;
    private String name;
    private Double salary;
    private Long departamentId;

    public PersonDTO(Long id, String name, Double salary, Long departamentId) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.departamentId = departamentId;
    }

    public PersonDTO(Person entity) {
        id =entity.getId();
        name = entity.getName();
        salary = entity.getSalary();
        departamentId = entity.getDepartment().getId();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    public Long getDepartamentId() {
        return departamentId;
    }
}
