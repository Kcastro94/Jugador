package com.example.Repository;

import com.example.Model.Liga;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * Created by jhipster on 28/10/15.
 */
public interface LigaRepository extends PagingAndSortingRepository<Liga, Long> {
    public List <Liga> findByNombre(String nombre);
}
