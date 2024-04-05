package com.softtek.modelo;

public class Bateria extends InstrumentoMusical{
    private int noPlatillos;

    public Bateria() {
    }

    public Bateria(String marca, int noPlatillos) {
        super(marca);
        this.noPlatillos = noPlatillos;
    }

    @Override
    public String emitirSonido(){
        return "Sonido de bateria";
    }

    @Override
    public String toString() {
        return "Bateria{" +
                "noPlatillos=" + noPlatillos +
                ", marca='" + marca + '\'' +
                '}';
    }

    public int getNoPlatillos() {
        return noPlatillos;
    }

    public void setNoPlatillos(int noPlatillos) {
        this.noPlatillos = noPlatillos;
    }
}
