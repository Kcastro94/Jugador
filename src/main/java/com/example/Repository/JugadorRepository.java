package com.example.Repository;

import com.example.Model.Jugador;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Date;
import java.util.List;

/**
 * Created by jhipster on 6/10/15.
 */
public interface JugadorRepository extends PagingAndSortingRepository<Jugador, Long> {
    public List<Jugador> findByNombreStartingWith(String nombre);
    public List<Jugador> findByNumCanastasGreaterThanEqual(Integer numCanastas);
    public List<Jugador> findByNumAsistenciasBetween(Integer min, Integer max);
    public List<Jugador> findByPosicion(String posicion);
    public List<Jugador> findByFechaNacimientoBefore(Date fechaNacimiento);
    public List<Jugador> findByNumCanastasGreaterThanEqualAndFechaNacimientoBefore(Integer numCanastas, Date fechaNacimiento);
}
