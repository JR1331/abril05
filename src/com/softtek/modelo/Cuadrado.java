package com.softtek.modelo;

public class Cuadrado extends Figura{
    protected double lado;

    public Cuadrado() {
    }

    public Cuadrado(int x, int y, double lado) {
        super(x, y);
        this.lado = lado;
    }

    @Override
    public double calcularArea(){
        return Math.pow(lado,2);
    }

    @Override
    public String toString() {
        return "Cuadrado{" +
                "lado=" + lado +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
