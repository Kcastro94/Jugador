package com.example.Service;

import com.example.Model.Equipo;
import com.example.Model.Liga;
import com.example.Model.Temporada;
import com.example.Repository.EquipoRepository;
import com.example.Repository.LigaRepository;
import com.example.Repository.TemporadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by jhipster on 28/10/15.
 */

@Service
@Transactional
public class TemporadaService {

    @Autowired
    private LigaRepository ligaRepository;

    @Autowired
    private TemporadaRepository temporadaRepository;

    @Autowired
    EquipoRepository equipoRepository;

    public void crearTemporada(){

        Equipo equipo1 = equipoRepository.findByNombre("Lakers").get(0);
        Equipo equipo2 = equipoRepository.findByNombre("Grizzlies").get(0);
        Equipo equipo3 = equipoRepository.findByNombre("Heat").get(0);
        Equipo equipo4 = equipoRepository.findByNombre("Pistons").get(0);
        Equipo equipo5 = equipoRepository.findByNombre("76ers").get(0);


        Temporada temporada1 = new Temporada(2014);
        Liga liga = ligaRepository.findByNombre("L1").get(0);
        temporada1.setLiga(liga);
        temporada1.getEquipos().add(equipo1);
        temporada1.getEquipos().add(equipo3);
        temporadaRepository.save(temporada1);

        Temporada temporada2 = new Temporada(1975);
        liga = ligaRepository.findByNombre("L2").get(0);
        temporada2.setLiga(liga);
        temporada2.getEquipos().add(equipo2);
        temporada2.getEquipos().add(equipo3);
        temporadaRepository.save(temporada2);

        Temporada temporada3 = new Temporada(1985);
        liga = ligaRepository.findByNombre("L1").get(0);
        temporada3.setLiga(liga);
        temporada3.getEquipos().add(equipo3);
        temporada3.getEquipos().add(equipo4);
        temporadaRepository.save(temporada3);

        Temporada temporada4 = new Temporada(2001);
        liga = ligaRepository.findByNombre("L2").get(0);
        temporada4.setLiga(liga);
        temporada4.getEquipos().add(equipo4);
        temporada4.getEquipos().add(equipo1);
        temporadaRepository.save(temporada4);

        Temporada temporada5 = new Temporada(2005);
        liga = ligaRepository.findByNombre("L1").get(0);
        temporada5.setLiga(liga);
        temporada5.getEquipos().add(equipo5);
        temporada5.getEquipos().add(equipo2);
        temporadaRepository.save(temporada5);

        System.out.println(temporada1.toString());
        System.out.println(temporada2.toString());
        System.out.println(temporada3.toString());
        System.out.println(temporada4.toString());
        System.out.println(temporada5.toString());

        /*Temporada{id=1, anyo=2014, equipos=[Equipo{id=2, nombre='Grizzlies', localidad='Memphis', fechaCreacion=1948-06-12 20:56:08.0}, Equipo{id=5, nombre='76ers', localidad='Philadelphia', fechaCreacion=1947-02-28 20:56:08.0}, Equipo{id=3, nombre='Heat', localidad='Miami', fechaCreacion=1940-01-23 20:56:08.0}, Equipo{id=4, nombre='Pistons', localidad='Detroid', fechaCreacion=1937-11-05 20:56:08.0}, Equipo{id=1, nombre='Lakers', localidad='Los Angeles', fechaCreacion=1945-10-15 20:56:08.0}], liga=Liga{id=1, nombre='L1'}}
        Temporada{id=2, anyo=1975, equipos=[], liga=Liga{id=2, nombre='L2'}}Temporada{id=3, anyo=1985, equipos=[], liga=Liga{id=1, nombre='L1'}}
        Temporada{id=4, anyo=2001, equipos=[], liga=Liga{id=2, nombre='L2'}}Temporada{id=5, anyo=2005, equipos=[], liga=Liga{id=1, nombre='L1'}}*/

    }
}
