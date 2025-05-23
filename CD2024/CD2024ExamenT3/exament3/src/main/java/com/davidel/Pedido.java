package com.davidel;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Producto> productos;

    public Pedido() {
        productos = new ArrayList<>();
    }
/**
 * 
 * @param producto
 */
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }
/**
 * 
 * @return
 */
    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getTotal();
        }
        return total;
    }
}
