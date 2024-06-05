package com.example.campeones.controllers;

import com.example.campeones.models.Campeon;
import com.example.campeones.services.CampeonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/campeones")
public class CampeonController {

    @Autowired
    private CampeonService campeonService;

    @PostMapping
    public ResponseEntity<Campeon> createCampeon(@RequestBody Campeon campeon) {
        Campeon savedCampeon = campeonService.saveCampeon(campeon);
        return new ResponseEntity<>(savedCampeon, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Campeon>> getAllCampeones() {
        List<Campeon> campeones = campeonService.getAllCampeones();
        return new ResponseEntity<>(campeones, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Campeon> getCampeonById(@PathVariable Long id) {
        Campeon campeon = campeonService.getCampeonById(id);
        if (campeon != null) {
            return new ResponseEntity<>(campeon, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCampeon(@PathVariable Long id) {
        campeonService.deleteCampeon(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
