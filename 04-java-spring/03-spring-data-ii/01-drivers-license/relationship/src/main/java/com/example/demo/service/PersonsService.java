package com.example.demo.service;

import com.example.demo.model.License;
import com.example.demo.model.Person;
import com.example.demo.repository.LicenseRepo;
import com.example.demo.repository.RelationshipRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonsService {

    RelationshipRepo relationshipRepo;
    LicenseRepo licenseRepos;

    public PersonsService(RelationshipRepo relationshipRepo, LicenseRepo licenseRepos) {
        this.relationshipRepo = relationshipRepo;
        this.licenseRepos = licenseRepos;
    }

    public License createLicense(License license){
        license.setNumber(this.generateLicenseNumber());
        return this.licenseRepos.save(license);
    }
    public int generateLicenseNumber() {
        License l = licenseRepos.findTopByOrderByNumberDesc();
        if(l == null)
            return 1;
        int largestNumber = l.getNumber();
        largestNumber++;
        return (largestNumber);
    }

    public Person createPerson(Person person){
        return this.relationshipRepo.save(person);
    }

    public List<Person> allPeople(){
        return this.relationshipRepo.findAll();

    }
    public List<Person> getUnlicensedPeople() {
        return relationshipRepo.findByLicenseIdIsNull();
    }
    public Person findPerson(long id){
        return relationshipRepo.findById(id);
    }
}
