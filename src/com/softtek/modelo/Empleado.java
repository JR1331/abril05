package com.softtek.modelo;

public class Empleado {
    protected String nombre;
    protected double sueldo;
    protected double PORCENTAJE=0.75;

    public Empleado(){

    }

    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public double calcularNomina(){
        return sueldo*PORCENTAJE;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", sueldo=" + sueldo +
                ", PORCENTAJE=" + PORCENTAJE +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getPORCENTAJE() {
        return PORCENTAJE;
    }

    public void setPORCENTAJE(double PORCENTAJE) {
        this.PORCENTAJE = PORCENTAJE;
    }
}
