package com.example.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by jhipster on 12/11/15.
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class EquipoException extends RuntimeException{
    public EquipoException(Long id) {
        super("NO EXISTE EQUIPO CON ID: "+id);
    }
}
