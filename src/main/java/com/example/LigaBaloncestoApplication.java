package com.example;

import com.example.Service.EquipoService;
import com.example.Service.JugadorService;
import com.example.Service.LigaService;
import com.example.Service.TemporadaService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LigaBaloncestoApplication {

    private static JugadorService jugadorService;
    private static EquipoService equipoService;
    private static LigaService ligaService;
    private static TemporadaService temporadaService;

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(LigaBaloncestoApplication.class, args);
        equipoService = context.getBean(EquipoService.class);
        jugadorService = context.getBean(JugadorService.class);
        ligaService = context.getBean(LigaService.class);
        temporadaService = context.getBean(TemporadaService.class);

        ligaService.crearLiga();
        equipoService.crearEquipo();
        jugadorService.crearJugador();

        temporadaService.crearTemporada();
    }
}
