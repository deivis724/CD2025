package com.davidel;

/**
 * La clase Persona representa a una persona con un nombre y una edad.
 * Proporciona métodos para acceder y modificar estos atributos, así como para imprimir los detalles de la persona.
 */
public class Persona {

    // Atributos privados de la clase
    private String nombre; // El nombre de la persona
    private int edad; // La edad de la persona

    /**
     * Constructor de la clase Persona.
     * @param nombre El nombre de la persona
     * @param edad   La edad de la persona
     */
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Obtiene el nombre de la persona.
     * @return El nombre de la persona
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la persona.
     * @param nombre El nuevo nombre de la persona
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la edad de la persona.
     * @return La edad de la persona
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Establece la edad de la persona.
     * @param edad La nueva edad de la persona
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Imprime los detalles de la persona, incluyendo el nombre y la edad.
     */
    public void imprimirDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}
