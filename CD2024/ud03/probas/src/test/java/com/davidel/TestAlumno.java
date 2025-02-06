package com.davidel;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static  org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TestAlumno {

    Alumno alumno;
    Alumno alumnoEmpty;

    @BeforeAll
    void createAlumno() {
        
        alumno = new Alumno();
        alumnoEmpty = new Alumno();

        alumno.setApellido1("Romero");
        alumno.setApellido2("Torres");
        alumno.setCorreo("pepe@gmail.com");
        alumno.setDni("12345678R");
        alumno.setFecNacimiento(LocalDate.of(2025,1,29));
        alumno.setIban("ES123456789");
        alumno.setMovil(123456789);
        alumno.setNombre("Pepe");
        alumno.setAutorizaTutores(true);
        alumno.setCodigoXade("1234");
    }

    @Test
    public void comprobarConstructorVacio(){
   
        assertNull(alumnoEmpty.getNombre());
        assertNull(alumnoEmpty.getApellido1());
        assertNull(alumnoEmpty.getApellido2());
        assertNull(alumnoEmpty.getCorreo());
        assertNull(alumnoEmpty.getDni());
        assertNull(alumnoEmpty.getFecNacimiento());
        assertNull(alumnoEmpty.getIban());
        assertNull(alumnoEmpty.getMovil());
        assertNull(alumnoEmpty.getCodigoXade());
        assertFalse(alumnoEmpty.isAutorizaTutores());
    }

    @Test
    public void comprobarGetters(){
                                         
        assertTrue(alumno.getNombre().equals("Pepe"));
        assertTrue(alumno.getApellido1().equals("Romero"));
        assertTrue(alumno.getApellido2().equals("Torres"));
        assertTrue(alumno.getCorreo().equals("pepe@gmail.com"));
        assertTrue(alumno.getDni().equals("12345678R"));
        assertTrue(alumno.getIban().equals("ES123456789"));
        assertEquals(alumno.getMovil(), 123456789);
        assertTrue(alumno.getFecNacimiento() instanceof LocalDate);
        assertTrue(alumno instanceof Alumno);
        assertTrue(alumno instanceof Persona);
        assertTrue(alumno.isAutorizaTutores());
        assertEquals(alumno.getCodigoXade(), "1234");
    }

    @Test
    public void comprobarToString(){    

        String tmp = "Alumno [codigoXade=1234, autorizaTutores=true]";
        assertEquals(alumno.toString(), tmp);
    }    
}
