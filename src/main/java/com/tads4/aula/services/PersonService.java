package com.tads4.aula.services;

import com.tads4.aula.dto.PersonDTO;
import com.tads4.aula.dto.PersonDepartamentDTO;
import com.tads4.aula.entities.Department;
import com.tads4.aula.entities.Person;
import com.tads4.aula.repositories.DepartmentRepository;
import com.tads4.aula.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonRepository repository;
    @Autowired
    private DepartmentRepository departmentRepository;
    public PersonDepartamentDTO insert (PersonDepartamentDTO dto){

        Person entity =  new Person();
        entity.setName((dto.getName()));
        entity.setSalary((dto.getSalary()));

        /*Department dept = new Department();
        dept.setId(dto.getDepartament().getId());*/

        Department dept = departmentRepository.getReferenceById(dto.getDepartament().getId());

        entity.setDepartment(dept);

        entity = repository.save(entity);

        return new PersonDepartamentDTO(entity);

    }

    public PersonDTO insert (PersonDTO dto){

        Person entity =  new Person();
        entity.setName((dto.getName()));
        entity.setSalary((dto.getSalary()));

        /*Department dept = new Department();
        dept.setId(dto.getDepartament().getId());*/

        Department dept = departmentRepository.getReferenceById(dto.getDepartamentId());

        entity.setDepartment(dept);

        entity = repository.save(entity);

        return new PersonDTO(entity);

    }

}
