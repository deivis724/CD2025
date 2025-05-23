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
 * le devuelve el precio del producto
 * @return
 */
    public double getPrecio() {
        return precio;
    }
/**
 * le devuelve la cantidad del producto
 * @return
 */
    public int getCantidad() {
        return cantidad;
    }
/**
 * le devuelve el total del producto
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
