package com.example.campeones.repositories;

import com.example.campeones.models.Nacionalidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NacionalidadRepository extends JpaRepository<Nacionalidad, Long> {
}
