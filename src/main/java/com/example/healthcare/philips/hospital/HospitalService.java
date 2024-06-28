package com.example.healthcare.philips.hospital;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class HospitalService {

    private final HospitalRepository repository;

    public HospitalService(HospitalRepository repository) {
        this.repository = repository;
    }

    public ResponseEntity<Hospital> validateHospital(String name, String password) {
        Optional<Hospital> hospital = repository.findByNameAndPassword(name, password);
        if (hospital.isPresent()) {
            return ResponseEntity.ok(hospital.get());
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
    }
}
