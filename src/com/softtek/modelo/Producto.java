package com.softtek.modelo;

public class Producto {
    protected String nombre;
    protected int cantidad;
    protected  double pvp;

    public Producto(String nombre, int cantidad, double pvp){
        this.nombre=nombre;
        this.cantidad=cantidad;
        this.pvp=pvp;
    }

    public Producto(){

    }

    public double cantidadAPagar(){
        return pvp;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", cantidad=" + cantidad +
                ", pvp=" + pvp +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPvp() {
        return pvp;
    }

    public void setPvp(double pvp) {
        this.pvp = pvp;
    }
}
