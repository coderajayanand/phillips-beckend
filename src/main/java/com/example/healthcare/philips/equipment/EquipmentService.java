package com.example.healthcare.philips.equipment;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipmentService {

    private EquipmentRepository repository;

    public EquipmentService(EquipmentRepository repository)
    {
        this.repository = repository;
    }

    public List<Equipment> getAllEquipments()
    {
        return repository.findAll();
    }

    public Equipment addEquipment(Equipment equipment)
    {
        return repository.save(equipment);
    }

    public Equipment baseEquipment()
    {
        return (new Equipment("x-ray", 2334, 342, "snfnfw"));
    }
}
