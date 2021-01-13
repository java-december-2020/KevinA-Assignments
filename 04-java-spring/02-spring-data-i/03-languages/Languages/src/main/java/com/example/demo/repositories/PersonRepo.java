package com.example.demo.repositories;

import com.example.demo.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepo extends CrudRepository<Person,Long> {
    List<Person> findAll();
    Person findById(long id);
    List<Person> findByLicense_Number(int n);

    List<Person> findByLicenseIdIsNull();
}

