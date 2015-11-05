package com.example.Repository;

import com.example.Model.Temporada;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * Created by jhipster on 28/10/15.
 */
public interface TemporadaRepository extends PagingAndSortingRepository<Temporada, Long>{
    public List <Temporada> findByAnyo(Integer anyo);
}
