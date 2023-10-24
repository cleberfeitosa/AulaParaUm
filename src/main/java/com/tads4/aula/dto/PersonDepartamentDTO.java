package com.tads4.aula.dto;

import com.tads4.aula.entities.Person;

public class PersonDepartamentDTO {

    private Long id;
    private String name;
    private Double salary;
    private DepartamentDTO departament;

    public PersonDepartamentDTO(Long id, String name, Double salary, DepartamentDTO departament) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.departament = departament;
    }

    public PersonDepartamentDTO(Person entity) {
        id =entity.getId();
        name = entity.getName();
        salary = entity.getSalary();
        departament = new DepartamentDTO((entity.getDepartment()));
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

    public DepartamentDTO getDepartament() {
        return departament;
    }
}
