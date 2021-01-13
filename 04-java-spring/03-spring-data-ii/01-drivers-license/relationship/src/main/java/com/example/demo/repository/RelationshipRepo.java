package com.example.demo.repository;

import com.example.demo.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RelationshipRepo extends CrudRepository<Person, Long> {
     List<Person> findAll();
     Person findById(long id);

    List<Person> findByLicenseIdIsNull();

}
