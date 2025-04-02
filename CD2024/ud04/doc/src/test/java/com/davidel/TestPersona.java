package com.davidel;

public class TestPersona {
    public static void main(String[] args) {
        // Crear instancias de Persona
        Persona persona1 = new Persona("David", 25);
        Persona persona2 = new Persona("María", 30);

        // Imprimir detalles iniciales
        System.out.println("Detalles de Persona 1:");
        persona1.imprimirDetalles();

        System.out.println("Detalles de Persona 2:");
        persona2.imprimirDetalles();

        // Modificar los atributos de las personas
        persona1.setNombre("Davidel");
        persona1.setEdad(26);

        persona2.setNombre("María Elisa");
        persona2.setEdad(31);

        // Imprimir detalles actualizados
        System.out.println("Detalles actualizados de Persona 1:");
        persona1.imprimirDetalles();

        System.out.println("Detalles actualizados de Persona 2:");
        persona2.imprimirDetalles();
    }
}
