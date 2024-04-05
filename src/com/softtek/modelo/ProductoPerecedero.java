package com.softtek.modelo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ProductoPerecedero extends Producto{
    private LocalDate fCaducidad;
    private LocalDate fFabricacion;

    public ProductoPerecedero(){

    }

    public ProductoPerecedero(String nombre, int cantidad, double pvp, LocalDate fCaducidad, LocalDate fFabricacion) {
        super(nombre, cantidad, pvp);
        this.fCaducidad = fCaducidad;
        this.fFabricacion = fFabricacion;
    }

    public long tiempoConsumicion(){
        long dif = fFabricacion.until(fCaducidad, ChronoUnit.DAYS);
        return dif;
    };

    @Override
    public String toString() {
        return "ProductoPerecedero{" +
                "nombre='" + nombre + '\'' +
                ", cantidad=" + cantidad +
                ", pvp=" + pvp +
                ", fCaducidad=" + fCaducidad +
                ", fFabricacion=" + fFabricacion +
                '}';
    }

    public LocalDate getfCaducidad() {
        return fCaducidad;
    }

    public void setfCaducidad(LocalDate fCaducidad) {
        this.fCaducidad = fCaducidad;
    }

    public LocalDate getfFabricacion() {
        return fFabricacion;
    }

    public void setfFabricacion(LocalDate fFabricacion) {
        this.fFabricacion = fFabricacion;
    }
}
