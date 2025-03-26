package com.davidel;
/**
* La clase circulo sirve para crear círculos en una posición y un tamaño que especifica su radio.
*/
public class Circulo {
    private int x;  // Coordenada horizontal del centro del círculo.
    private int y;  // Coordenada vertical del centro del círculo.
    private double radio;  // Tamaño del círculo, especificado por su radio.

    /**
    * Constructor para inicializar el círculo con valores específicos.
    * @param valorX Posición horizontal.
    * @param valorY Posición vertical.
    * @param valorRadio Tamaño del radio.
    */
    public Circulo(int valorX, int valorY, double valorRadio) {
        establecerX(valorX);  // Configura la coordenada x.
        establecerY(valorY);  // Configura la coordenada y.
        establecerRadio(valorRadio);  // Configura el radio, con validación.
    }

    /**
    * Asigna un valor a la coordenada x del círculo.
    * @param valorX Nuevo valor para x.
    */
    public void establecerX(int valorX) {
        x = valorX;
    }

    /**
    * Obtiene el valor actual de la coordenada x.
    * @return Coordenada horizontal del círculo.
    */
    public int obtenerX() {
        return x;
    }

    /**
    * Asigna un valor a la coordenada y del círculo.
    * @param valorY Nuevo valor para y.
    */
    public void establecerY(int valorY) {
        y = valorY;
    }

    /**
    * Obtiene el valor actual de la coordenada y.
    * @return Coordenada vertical del círculo.
    */
    public int obtenerY() {
        return y;
    }

    /**
    * Configura el radio del círculo. Si el valor es negativo, se ajusta a 0.0.
    * @param valorRadio Nuevo tamaño del radio.
    */
    public void establecerRadio(double valorRadio) {
        radio = (valorRadio < 0.0 ? 0.0 : valorRadio);  // Validación: el radio no puede ser negativo.
    }

    /**
    * Devuelve el valor actual del radio del círculo.
    * @return Radio del círculo.
    */
    public double obtenerRadio() {
        return radio;
    }

    /**
    * Calcula y devuelve el diámetro del círculo.
    * @return Diámetro del círculo (radio multiplicado por 2).
    */
    public double obtenerDiametro() {
        return radio * 2;
    }

    /**
    * Calcula y devuelve la circunferencia del círculo.
    * @return Circunferencia del círculo (π * diámetro).
    */
    public double obtenerCircunferencia() {
        return Math.PI * obtenerDiametro();
    }

    /**
    * Calcula y devuelve el área del círculo.
    * @return Área del círculo (π * radio^2).
    */
    public double obtenerArea() {
        return Math.PI * radio * radio;
    }

    /**
    * Representación textual del objeto círculo.
    * @return Cadena con el centro y el radio del círculo.
    */
    @Override
    public String toString() {
        return "Centro = [" + x + "," + y + "]; Radio = " + radio;
    }
}
