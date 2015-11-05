package com.example.Repository;

import com.example.Model.Jugador;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

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

    public List<Jugador> findByEquipo_nombre(String nombre);
    public List<Jugador> findByEquipoNombreAndPosicion(String nombre, String posicion);
    public List<Jugador> findFirstByOrderByNumCanastasDesc();
    public List<Jugador> findFirst5ByOrderByNumCanastasDesc();


    @Query("SELECT j FROM Jugador j WHERE j.equipo.nombre = :nombre ORDER BY j.numCanastas DESC")
    List<Jugador> findByEquipoNombreCanastasDesc(@Param("nombre") String nombre);


}
