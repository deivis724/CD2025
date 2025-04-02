package com.davidel;

public class TestCirculo {
    public static void main(String[] args) {
        // Crear una instancia de Circulo
        Circulo circulo1 = new Circulo(10, 15, 7.5);

        // Imprimir detalles iniciales del círculo
        System.out.println("Detalles del Círculo:");
        System.out.println(circulo1);

        // Calcular y mostrar el área, el diámetro y la circunferencia
        System.out.println("Área: " + circulo1.obtenerArea());
        System.out.println("Diámetro: " + circulo1.obtenerDiametro());
        System.out.println("Circunferencia: " + circulo1.obtenerCircunferencia());

        // Cambiar la posición y el radio del círculo
        circulo1.establecerX(20);
        circulo1.establecerY(25);
        circulo1.establecerRadio(10.0);

        // Imprimir los detalles después del cambio
        System.out.println("Detalles del Círculo (actualizados):");
        System.out.println(circulo1);
    }
}
