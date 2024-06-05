package com.example.campeones.repositories;

import com.example.campeones.models.Campeon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CampeonRepository extends JpaRepository<Campeon, Long> {
}
