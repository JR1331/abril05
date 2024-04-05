package com.softtek.modelo;

public class Gerente extends Empleado{
    private double bono;

    public Gerente(){

    }

    public Gerente(String nombre, double sueldo, double bono) {
        super(nombre, sueldo);
        this.bono = bono;
    }
    @Override
    public double calcularNomina(){
        return(bono+sueldo)*PORCENTAJE;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nombre='" + nombre + '\'' +
                ", sueldo=" + sueldo +
                ", PORCENTAJE=" + PORCENTAJE +
                ", bono=" + bono +
                '}';
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }
}
