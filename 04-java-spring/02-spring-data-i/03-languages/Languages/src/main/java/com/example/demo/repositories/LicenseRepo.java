package com.example.demo.repositories;

import com.example.demo.model.License;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LicenseRepo extends CrudRepository<License, Long> {
     List<License> findAll();
     License findTopByOrderByNumberDesc();
}
