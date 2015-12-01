package com.example.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.*;


/**
 * Created by jhipster on 6/10/15.
 */
@Entity
public class Jugador {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String nombre;

    @Column
    private Date fechaNacimiento;

    @Column
    private Integer numCanastas;

    @Column
    private Integer numAsistencias;

    @Column
    private Integer rebotesTotales;

    @Column
    private String posicion;

    @JsonIgnore
    @ManyToOne
    private Equipo equipo;

    public Jugador(){

    }
    public Jugador(String nombre, Date fechaNacimiento, Integer numCanastas, Integer numAsistencias, Integer rebotesTotales, String posicion){
        this.nombre=nombre;
        this.fechaNacimiento=fechaNacimiento;
        this.numCanastas=numCanastas;
        this.numAsistencias=numAsistencias;
        this.rebotesTotales=rebotesTotales;
        this.posicion=posicion;
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

    public void setNombre(String jugador) {
        this.nombre = jugador;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }


    public Integer getNumCanastas() {
        return numCanastas;
    }

    public void setNumCanastas(Integer numCanastas) {
        this.numCanastas = numCanastas;
    }

    public Integer getNumAsistencias() {
        return numAsistencias;
    }

    public void setNumAsistencias(Integer numAsistencias) {
        this.numAsistencias = numAsistencias;
    }

    public Integer getRebotesTotales() {
        return rebotesTotales;
    }

    public void setRebotesTotales(Integer rebotesTotales) {
        this.rebotesTotales = rebotesTotales;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }


    @Override
    public String toString() {
        return "Jugador{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", numCanastas=" + numCanastas +
                ", numAsistencias=" + numAsistencias +
                ", rebotesTotales=" + rebotesTotales +
                ", posicion='" + posicion + '\'' +
                ", equipo=" + equipo +
                '}';
    }
}
