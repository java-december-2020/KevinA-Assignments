package com.example.demo.services;

import com.example.demo.model.Person;
import com.example.demo.repositories.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    PersonRepo repo;

    public List<Person> getPersons(){
        return (List<Person>) repo.findAll();
    }

    public Person getPerson(long id){
        return repo.findById(id);
    }
    public Person createNewPerson(Person person){
        return repo.save(person);
    }

    public List<Person> getUnlicensedPeople() {
        return repo.findByLicenseIdIsNull();
    }
}
