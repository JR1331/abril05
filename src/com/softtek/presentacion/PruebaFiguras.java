package com.softtek.presentacion;

import com.softtek.modelo.Cuadrado;
import com.softtek.modelo.Figura;
import com.softtek.modelo.Triangulo;

public class PruebaFiguras {
    public static void main(String[] args) {
        Cuadrado cPeque = new Cuadrado();
        cPeque.setLado(4);
        cPeque.setX(2);
        cPeque.setY(2);

        Figura cMediano = new Cuadrado(1,1,5);

        Triangulo tPeque = new Triangulo();
        tPeque.setAltura(5);
        tPeque.setBase(3);
        tPeque.setX(3);
        tPeque.setY(7);

        Figura tMediano = new Triangulo(8,6,9,7);

        Figura[] figuras= {cPeque,cMediano,tPeque,tMediano};

        for (Figura figura : figuras){
            System.out.println("Area "+figura.calcularArea());
        }
    }
}
