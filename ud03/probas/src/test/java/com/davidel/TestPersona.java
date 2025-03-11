package com.davidel;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static  org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class TestPersona {

    @Test
    public void comprobarNombre(){

        Persona mengano = new Persona();
        mengano.setNombre("Pepe");

        boolean resultado = mengano.getNombre() == "Pepe";

        assertTrue(resultado);
    }

    @Test
    public void comprobarConstructorVacio(){

        Persona mengano = new Persona();

        //boolean resultado = mengano.getNombre() == null;
        //assertTrue(resultado);
        
        assertNull(mengano.getNombre());
        assertNull(mengano.getApellido1());
        assertNull(mengano.getApellido2());
        assertNull(mengano.getCorreo());
        assertNull(mengano.getDni());
        assertNull(mengano.getFecNacimiento());
        assertNull(mengano.getIban());
        assertNull(mengano.getMovil());
    }

    @Test
    public void comprobarConstructorCompleto(){

        Persona mengano = new Persona("12345678R", "Pepe",
                                     "Romero","Torres",
                                      "pepe@gmail.com",123456789,
                                      LocalDate.of(2025,1,29), "ES123456789" );
                                           
        assertTrue(mengano.getNombre().equals("Pepe"));
        assertTrue(mengano.getApellido1().equals("Romero"));
        assertTrue(mengano.getApellido2().equals("Torres"));
        assertTrue(mengano.getCorreo().equals("pepe@gmail.com"));
        assertTrue(mengano.getDni().equals("12345678R"));
        assertTrue(mengano.getIban().equals("ES123456789"));
        assertEquals(mengano.getMovil(), 123456789);
        assertTrue(mengano.getFecNacimiento() instanceof LocalDate);

        assertTrue(mengano instanceof Persona);

    }

    @Test
    public void comprobarSetters(){

        Persona mengano = new Persona();

        mengano.setApellido1("Romero");
        mengano.setApellido2("Torres");
        mengano.setCorreo("pepe@gmail.com");
        mengano.setDni("12345678R");
        mengano.setFecNacimiento(LocalDate.of(2025,1,29));
        mengano.setIban("ES123456789");
        mengano.setMovil(123456789);
        mengano.setNombre("Pepe");
                                           
        assertTrue(mengano.getNombre().equals("Pepe"));
        assertTrue(mengano.getApellido1().equals("Romero"));
        assertTrue(mengano.getApellido2().equals("Torres"));
        assertTrue(mengano.getCorreo().equals("pepe@gmail.com"));
        assertTrue(mengano.getDni().equals("12345678R"));
        assertTrue(mengano.getIban().equals("ES123456789"));
        assertEquals(mengano.getMovil(), 123456789);
        assertTrue(mengano.getFecNacimiento() instanceof LocalDate);
        assertTrue(mengano instanceof Persona);
    }

    @Test
    public void comprobarToString(){

        Persona mengano = new Persona("12345678R", "Pepe",
                                     "Romero","Torres",
                                      "pepe@gmail.com",123456789,
                                      LocalDate.of(2025,1,29), "ES123456789" );
        
        

        String tmp = "Persona [dni=12345678R, nombre=Pepe, apellido1=Romero, apellido2=Torres, correo=pepe@gmail.com, movil=123456789, fecNacimiento=2025-01-29, iban=ES123456789]";
        assertEquals(mengano.toString(), tmp);
    }    
}
