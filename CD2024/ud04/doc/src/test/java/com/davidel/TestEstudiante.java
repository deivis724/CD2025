package com.davidel;

public final class TestEstudiante {

    // Constructor privado para evitar instanciación
    private TestEstudiante() {
        throw new UnsupportedOperationException("Esta clase no debe ser instanciada.");
    }

    public static void main(String[] args) {
        // Crear instancias de Estudiante
        final int edad1 = 20;
        final int edad2 = 16;
        Estudiante estudiante1 = new Estudiante("Laura", edad1);
        Estudiante estudiante2 = new Estudiante("Carlos", edad2);

        // Asignar calificaciones
        final double calificacion1 = 8.5;
        estudiante1.setCalificacion(calificacion1);
        final double calificacion2 = 4.3;
        estudiante2.setCalificacion(calificacion2);

        // Imprimir información
        estudiante1.imprimirInformacion();
        estudiante2.imprimirInformacion();

        // Verificar si aprobaron el curso
        System.out.println("¿Estudiante 1 aprobó?: " + estudiante1.aprobo());
        System.out.println("¿Estudiante 2 aprobó?: " + estudiante2.aprobo());

        // Verificar edad escolar y universitario
        System.out.println("Años escolares aproximados de Estudiante 1: " + estudiante1.edadEscolar());
        System.out.println("¿Estudiante 1 es universitario?: " + estudiante1.esUniversitario());

        System.out.println("Años escolares aproximados de Estudiante 2: " + estudiante2.edadEscolar());
        System.out.println("¿Estudiante 2 es universitario?: " + estudiante2.esUniversitario());
    }
}

