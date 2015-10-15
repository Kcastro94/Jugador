package com.example.Model;

import javax.persistence.*;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by jhipster on 6/10/15.
 */
@Entity
public class Jugador {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nombre;

    private Date fechaNacimiento;

    private Integer numCanastas;

    private Integer numAsistencias;

    private Integer rebotesTotales;

    private String posicion;

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
                '}';
    }
}
