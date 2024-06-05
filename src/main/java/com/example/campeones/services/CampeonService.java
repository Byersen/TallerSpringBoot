package com.example.campeones.services;

import com.example.campeones.models.Campeon;
import com.example.campeones.repositories.CampeonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CampeonService {

    @Autowired
    private CampeonRepository campeonRepository;

    public Campeon saveCampeon(Campeon campeon) {
        return campeonRepository.save(campeon);
    }

    public List<Campeon> getAllCampeones() {
        return campeonRepository.findAll();
    }

    public Campeon getCampeonById(Long id) {
        return campeonRepository.findById(id).orElse(null);
    }

    public void deleteCampeon(Long id) {
        campeonRepository.deleteById(id);
    }
}
