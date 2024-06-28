package com.example.healthcare.philips.hospital;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/hospital")
public class HospitalController {

    private HospitalService service;

    @Autowired
    public HospitalController(HospitalService service) {
        this.service = service;
    }

    @GetMapping("/validate")
    public ResponseEntity<Hospital> validateHospitalCredentials(@RequestParam String name, @RequestParam String password) {
        return service.validateHospital(name, password);
    }
}