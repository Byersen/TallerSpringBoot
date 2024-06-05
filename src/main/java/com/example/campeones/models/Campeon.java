package com.example.campeones.models;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Campeon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCampeon;

    private String tipoAtaque;
    private int vidaBase;
    private boolean manaBool;
    private boolean energiaBool;
    private float velocidadAtaqueBase;
    private float velocidadMovimientoBase;
    private String nombre;

}
