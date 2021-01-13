package com.example.demo.services;

import com.example.demo.model.License;
import com.example.demo.repositories.LicenseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LicenseService {
    @Autowired
    LicenseRepo repo;

    public License createLicense(License newLicense) {
        newLicense.setNumber(this.generateLicenseNumber());
        return repo.save(newLicense);
    }


    public int generateLicenseNumber() {
        License lis = repo.findTopByOrderByNumberDesc();
        if (lis == null)
            return 1;
        int largestNumber = lis.getNumber();
        largestNumber++;
        return (largestNumber);
    }
}
