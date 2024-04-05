package com.softtek.modelo;

public class Flauta extends InstrumentoMusical{
    private String material;

    public Flauta() {
    }

    public Flauta(String marca, String material) {
        super(marca);
        this.material = material;
    }

    @Override
    public String emitirSonido(){
        return "sonido de flauta";
    }

    @Override
    public String toString() {
        return "Flauta{" +
                "material='" + material + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
