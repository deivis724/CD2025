package com.davidel;

/**
 * La clase Estudiante representa a un estudiante con atributos básicos
 * como nombre, edad y calificación, y métodos para interactuar con ellos.
 */
public class Estudiante {

    // Atributos
    private String nombre; // Nombre del estudiante.
    private int edad;      // Edad del estudiante en años.
    private double calificacion; // Calificación del estudiante, inicializada a 0.0.

    /**
     * Constructor que inicializa los atributos nombre y edad.
     * La calificación se establece por defecto en 0.0.
     * @param nombre El nombre del estudiante.
     * @param edad La edad del estudiante en años.
     */
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.calificacion = 0.0;
    }

    /**
     * Establece la calificación del estudiante.
     * @param calificacion La calificación nueva del estudiante.
     */
    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    /**
     * Obtiene el nombre del estudiante.
     * @return El nombre del estudiante.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece un nuevo nombre para el estudiante.
     * @param nombre El nuevo nombre del estudiante.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la edad del estudiante.
     * @return La edad del estudiante en años.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Establece una nueva edad para el estudiante.
     * @param edad La nueva edad del estudiante.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Obtiene la calificación actual del estudiante.
     * @return La calificación del estudiante.
     */
    public double getCalificacion() {
        return calificacion;
    }

    /**
     * Verifica si el estudiante aprobó el curso.
     * Se considera aprobado si la calificación es mayor o igual a 5.0.
     * @return true si el estudiante aprobó, false de lo contrario.
     */
    public boolean aprobo() {
        final double calificacin = 5.0;
        return calificacion >= calificacin;
    }

    /**
     * Calcula los años escolares aproximados del estudiante.
     * Esto se calcula dividiendo la edad entre 12.
     * @return Los años escolares aproximados.
     */
    public int edadEscolar() {
        final int edaecolar = 12;
        return edad / edaecolar;
    }

    /**
     * Verifica si el estudiante tiene edad para ser universitario.
     * Se considera universitario si la edad es mayor o igual a 18.
     * @return true si es universitario, false de lo contrario.
     */
    public boolean esUniversitario() {
        final int edauniversi = 18;
        return edad >= edauniversi;
    }

    /**
     * Imprime la información del estudiante (nombre, edad, calificación) en consola.
     */
    public void imprimirInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Calificación: " + calificacion);
    }
}
