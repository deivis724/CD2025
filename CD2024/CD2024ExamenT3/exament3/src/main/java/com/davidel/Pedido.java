package com.davidel;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Producto> productos;

    public Pedido() {
        productos = new ArrayList<>();
    }
/**
 * Agrega un producto a la lista de productos del pedido
 * @param producto
 */
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }
/**
 * borra un producto de la lista de productos del pedido
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
