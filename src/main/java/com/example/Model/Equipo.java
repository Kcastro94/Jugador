package com.example.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.*;

/**
 * Created by jhipster on 15/10/15.
 */
@Entity
public class Equipo{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String nombre;

    @Column
    private String localidad;

    @Column
    private Date fechaCreacion;

    @JsonIgnore
    @OneToMany(mappedBy = "equipo")
    private Set<Jugador> jugadores = new HashSet<>();

    @JsonIgnore
    @ManyToMany
    private Set<Temporada> temporadas = new HashSet<>();
    
    public Equipo(){

    }

    public Equipo(String nombre, String localidad, Date fechaCreacion){
        this.nombre = nombre;
        this.localidad = localidad;
        this.fechaCreacion = fechaCreacion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

   public Set<Jugador> getJugador(){
        return jugadores;
    }
    public void setJugadores(Set<Jugador> jugadores){
        this.jugadores = jugadores;
    }

    public Set<Temporada> getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(Set<Temporada> temporadas) {
        this.temporadas = temporadas;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", localidad='" + localidad + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                '}';
    }
}

