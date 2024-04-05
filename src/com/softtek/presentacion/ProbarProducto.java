package com.softtek.presentacion;

import com.softtek.modelo.Producto;
import com.softtek.modelo.ProductoPerecedero;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ProbarProducto {
    public static void main(String[] args) {
        Producto p = new Producto("ordenador",10,199.99);
        LocalDate ahora = LocalDate.now();
        ProductoPerecedero pp = new ProductoPerecedero("leche",60,3.50,ahora,ahora.minus(22, ChronoUnit.DAYS));

        System.out.println(p.toString());
        System.out.println(pp.toString());
        System.out.println(pp.tiempoConsumicion());
    }
}
