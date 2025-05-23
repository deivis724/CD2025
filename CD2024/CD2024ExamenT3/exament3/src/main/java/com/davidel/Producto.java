package com.davidel;

public class Producto {
    private String nombre;
    private double precio;
    private int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
/**
 * 
 * @return
 */
    public String getNombre() {
        return nombre;
    }
/**
 * 
 * @return
 */
    public double getPrecio() {
        return precio;
    }
/**
 * 
 * @return
 */
    public int getCantidad() {
        return cantidad;
    }
/**
 * 
 * @return
 */
    public double getTotal() {
        return precio * cantidad;
    }

    @Override
    public String toString() {
        return nombre + " - " + cantidad + " x " + precio + " = " + getTotal();
    }
}
