package com.davidel;

public class TestEstudiante {
    public static void main(String[] args) {
        // Crear instancias de Estudiante
        Estudiante estudiante1 = new Estudiante("Laura", 20);
        Estudiante estudiante2 = new Estudiante("Carlos", 16);

        // Asignar calificaciones
        estudiante1.setCalificacion(8.5);
        estudiante2.setCalificacion(4.3);

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
