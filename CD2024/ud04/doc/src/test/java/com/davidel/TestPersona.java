package com.davidel;

public final class TestPersona {

    // Constructor privado para evitar la instanciación
    private TestPersona() {
        throw new UnsupportedOperationException("Esta es una clase utilitaria y no debe ser instanciada.");
    }

    public static void main(String[] args) {
        // Crear instancias de Persona
        final int david = 25;
        final int maria = 30;

        Persona persona1 = new Persona("David", david);
        Persona persona2 = new Persona("María", maria);

        // Imprimir detalles iniciales
        System.out.println("Detalles de Persona 1:");
        persona1.imprimirDetalles();

        System.out.println("Detalles de Persona 2:");
        persona2.imprimirDetalles();

        // Modificar los atributos de las personas
        persona1.setNombre("Davidel");
        final int person1 = 26;
        persona1.setEdad(person1);

        persona2.setNombre("María Elisa");
        final int person2 = 31;
        persona2.setEdad(person2);

        // Imprimir detalles actualizados
        System.out.println("Detalles actualizados de Persona 1:");
        persona1.imprimirDetalles();

        System.out.println("Detalles actualizados de Persona 2:");
        persona2.imprimirDetalles();
    }
}
