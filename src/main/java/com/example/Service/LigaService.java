package com.example.Service;

import com.example.Model.Liga;
import com.example.Repository.LigaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by jhipster on 28/10/15.
 */
@Service
@Transactional
public class LigaService {

    @Autowired
    private LigaRepository ligaRepository;

    public void crearLiga(){
        Liga liga1 = new Liga("L1");
        ligaRepository.save(liga1);

        Liga liga2 = new Liga("L2");
        ligaRepository.save(liga2);
    }
}
