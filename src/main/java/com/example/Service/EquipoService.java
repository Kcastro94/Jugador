package com.example.Service;

import com.example.Model.Equipo;
import com.example.Model.Jugador;
import com.example.Model.Temporada;
import com.example.Repository.EquipoRepository;
import com.example.Repository.JugadorRepository;
import com.example.Repository.TemporadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by jhipster on 15/10/15.
 */
@Service
@Transactional
public class EquipoService {

    @Autowired
    private EquipoRepository equipoRepository;

    @Autowired
    private TemporadaRepository temporadaRepository;

    public void crearEquipo(){
        Calendar calendar = GregorianCalendar.getInstance();


        calendar.set(1945, Calendar.OCTOBER, 15);
        Equipo equipo1 = new Equipo();
        equipo1.setNombre("Lakers");
        equipo1.setFechaCreacion(calendar.getTime());
        equipo1.setLocalidad("Los Angeles");
        equipoRepository.save(equipo1);

        calendar.set(1948, Calendar.JUNE, 12);
        Equipo equipo2 = new Equipo();
        equipo2.setNombre("Grizzlies");
        equipo2.setFechaCreacion(calendar.getTime());
        equipo2.setLocalidad("Memphis");
        equipoRepository.save(equipo2);

        calendar.set(1940, Calendar.JANUARY, 23);
        Equipo equipo3 = new Equipo();
        equipo3.setNombre("Heat");
        equipo3.setFechaCreacion(calendar.getTime());
        equipo3.setLocalidad("Miami");
        equipoRepository.save(equipo3);

        calendar.set(1937, Calendar.NOVEMBER, 5);
        Equipo equipo4 = new Equipo();
        equipo4.setNombre("Pistons");
        equipo4.setFechaCreacion(calendar.getTime());
        equipo4.setLocalidad("Detroid");
        equipoRepository.save(equipo4);

        calendar.set(1947, Calendar.FEBRUARY, 28);
        Equipo equipo5 = new Equipo();
        equipo5.setNombre("76ers");
        equipo5.setFechaCreacion(calendar.getTime());
        equipo5.setLocalidad("Philadelphia");
        equipoRepository.save(equipo5);

     System.out.println(equipoRepository.findByLocalidad("Philadelphia"));
    }
}
