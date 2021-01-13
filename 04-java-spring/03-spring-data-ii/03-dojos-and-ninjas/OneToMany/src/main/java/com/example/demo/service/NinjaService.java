package com.example.demo.service;

import com.example.demo.models.Ninja;
import com.example.demo.repositories.NinaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NinjaService {
    @Autowired
    NinaRepo ninaRepo;
    public Ninja createNinja(Ninja ninja){
        return ninaRepo.save(ninja);
    }
    public Ninja getNinja(Long id){
        return ninaRepo.getById(id);
    }
    public List<Ninja> findAll(){
        return ninaRepo.findAll();
    }
}
