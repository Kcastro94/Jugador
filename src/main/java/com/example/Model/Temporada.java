package com.example.Model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by jhipster on 28/10/15.
 */

@Entity
public class Temporada {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private Integer anyo;

    @ManyToOne
    private Liga liga;

    @ManyToMany(mappedBy = "temporadas")
    private Set <Equipo> equipos = new HashSet<>();

    public Temporada(){

    }
    public Temporada(Integer anyo){
        this.anyo=anyo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAnyo() {
        return anyo;
    }

    public void setAnyo(Integer anyo) {
        this.anyo = anyo;
    }

    public Liga getLiga() {
        return liga;
    }

    public void setLiga(Liga liga) {
        this.liga = liga;
    }

    public Set<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(Set<Equipo> equipos) {
        this.equipos = equipos;
    }

    @Override
    public String toString() {
        return "Temporada{" +
                "id=" + id +
                ", anyo=" + anyo +
                ", equipos=" + equipos +
                ", liga=" + liga +
                '}';
    }
}
