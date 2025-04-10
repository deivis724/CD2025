package com.davidel;

public final class TestCirculo {

    // Constructor privado para prevenir la instanciación
    private TestCirculo() {
        throw new UnsupportedOperationException("Esta clase no debe ser instanciada.");
    }

    public static void main(String[] args) {
        // Crear una instancia de Circulo
        final int valorX = 10;
        final int valorY = 15;
        final double valorRadio = 7.5;
        Circulo circulo1 = new Circulo(valorX, valorY, valorRadio);

        // Imprimir detalles iniciales del círculo
        System.out.println("Detalles del Círculo:");
        System.out.println(circulo1);

        // Calcular y mostrar el área, el diámetro y la circunferencia
        System.out.println("Área: " + circulo1.obtenerArea());
        System.out.println("Diametro: " + circulo1.obtenerDiametro());
        System.out.println("Circunferencia: " + circulo1.obtenerCircunferencia());

        // Cambiar la posición y el radio del círculo
        final int establecerX = 20;
        circulo1.establecerX(establecerX);
        final int establecerY = 25;
        circulo1.establecerY(establecerY);
        final double establecerradio = 10.0;
        circulo1.establecerRadio(establecerradio);

        // Imprimir los detalles después del cambio
        System.out.println("Detalles del Círculo (actualizados):");
        System.out.println(circulo1);
    }
}
