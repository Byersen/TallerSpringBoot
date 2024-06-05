package com.example.campeones.repositories;

import com.example.campeones.models.Rival;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RivalRepository extends JpaRepository<Rival, Long> {
}
