package com.example.demo.repositories;

import com.example.demo.models.Ninja;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NinaRepo extends CrudRepository<Ninja, Long> {
    List<Ninja> findAll();
    Ninja getById(long id);
}
