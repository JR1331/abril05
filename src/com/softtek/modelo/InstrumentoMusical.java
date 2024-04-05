package com.softtek.modelo;

public class InstrumentoMusical {
    protected String marca;

    public InstrumentoMusical(){

    }

    public InstrumentoMusical(String marca) {
        this.marca = marca;
    }

    public String emitirSonido(){
        String ruido="";
        return ruido;
    }

    @Override
    public String toString() {
        return "InstrumentoMusical{" +
                "marca='" + marca + '\'' +
                '}';
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
