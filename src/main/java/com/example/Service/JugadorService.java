package com.example.Service;

import com.example.Model.Jugador;
import com.example.Repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by jhipster on 6/10/15.
 */
@Service
@Transactional
public class JugadorService {

    @Autowired
    private JugadorRepository jugadorRepository;



    public void crearJugador(){
        Calendar calendar = GregorianCalendar.getInstance();

        calendar.set(1995, Calendar.DECEMBER, 11);
        Jugador jugador1 = new Jugador();
        jugador1.setNombre("Kevin");
        jugador1.setFechaNacimiento(calendar.getTime());
        jugador1.setPosicion("Escolta");
        jugador1.setNumCanastas(250);
        jugador1.setNumAsistencias(120);
        jugador1.setRebotesTotales(60);
        jugadorRepository.save(jugador1);

        calendar.set(1975, Calendar.JUNE, 7);
        Jugador jugador2 = new Jugador();
        jugador2.setNombre("Allen Iverson");
        jugador2.setFechaNacimiento(calendar.getTime());
        jugador2.setPosicion("Base");
        jugador2.setNumCanastas(300);
        jugador2.setNumAsistencias(150);
        jugador2.setRebotesTotales(70);
        jugadorRepository.save(jugador2);

        calendar.set(1984, Calendar.MAY, 29);
        Jugador jugador3 = new Jugador();
        jugador3.setNombre("Carmello Anthony");
        jugador3.setFechaNacimiento(calendar.getTime());
        jugador3.setPosicion("Alero");
        jugador3.setNumCanastas(350);
        jugador3.setNumAsistencias(130);
        jugador3.setRebotesTotales(75);
        jugadorRepository.save(jugador3);

        calendar.set(1972, Calendar.MARCH, 6);
        Jugador jugador4 = new Jugador();
        jugador4.setNombre("Shaquille O'neal");
        jugador4.setFechaNacimiento(calendar.getTime());
        jugador4.setPosicion("Pivot");
        jugador4.setNumCanastas(280);
        jugador4.setNumAsistencias(50);
        jugador4.setRebotesTotales(150);
        jugadorRepository.save(jugador4);

        calendar.set(1978, Calendar.JUNE, 19);
        Jugador jugador5 = new Jugador();
        jugador5.setNombre("Dirk Nowitzki");
        jugador5.setFechaNacimiento(calendar.getTime());
        jugador5.setPosicion("Ala-pivot");
        jugador5.setNumCanastas(310);
        jugador5.setNumAsistencias(60);
        jugador5.setRebotesTotales(90);
        jugadorRepository.save(jugador5);

        System.out.println(jugadorRepository.findByNombreStartingWith("Al"));
        System.out.println(jugadorRepository.findByNumCanastasGreaterThanEqual(100));
        System.out.println(jugadorRepository.findByNumAsistenciasBetween(50, 100));
        System.out.println(jugadorRepository.findByPosicion("Base"));
        calendar.set(1990, Calendar.OCTOBER, 23);
        System.out.println(jugadorRepository.findByFechaNacimientoBefore(calendar.getTime()));
        calendar.set(1980, Calendar.JULY, 16);
        System.out.println(jugadorRepository.findByNumCanastasGreaterThanEqualAndFechaNacimientoBefore(100,calendar.getTime()));

    }
}
