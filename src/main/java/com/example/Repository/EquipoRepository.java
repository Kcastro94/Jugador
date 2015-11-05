package com.example.Repository;

import com.example.Model.Equipo;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;


import java.util.List;


/**
 * Created by jhipster on 15/10/15.
 */
public interface EquipoRepository extends PagingAndSortingRepository<Equipo, Long> {
    public List<Equipo> findByNombre(String nombre);


    public List<Equipo> findByLocalidad(String localidad);
}
