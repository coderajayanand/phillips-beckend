package com.example.healthcare.philips.equipment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.convert.EntityWriter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api")
public class EquipmentController {
    private EquipmentService service;

    @Autowired
    public EquipmentController(EquipmentService service)
    {
        this.service = service;
    }

    @GetMapping("/getAllEquipments")
    public ResponseEntity<List<Equipment>> getEquipments()
    {
        List<Equipment> allEquipments = service.getAllEquipments();
        return ResponseEntity.ok(allEquipments);
    }

    @PostMapping("/addEquipment")
    public ResponseEntity<Equipment> addEquipment(@RequestBody Equipment equipment)
    {
        return ResponseEntity.ok(service.addEquipment(equipment));
    }

    @GetMapping("/baseEquipment")
    public ResponseEntity<Equipment> baseEquipment()
    {
        return ResponseEntity.ok(service.baseEquipment());
    }

//    @PutMapping("/{id}/quantity")
//    public
}
