package com.example.demo.service;

import com.example.demo.models.Dojo;
import com.example.demo.repositories.DojoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DojoService {
    @Autowired
    private DojoRepository dojoRepository;

    public List<Dojo> findAllDojos() {
        return dojoRepository.findAll();
    }

    public Dojo createDojo(Dojo newDojo) {
        return dojoRepository.save(newDojo);
    }

    public Dojo getDojo(long id){
        return dojoRepository.getById(id);
    }
}
