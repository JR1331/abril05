package com.softtek.presentacion;

import com.softtek.modelo.Bateria;
import com.softtek.modelo.Flauta;
import com.softtek.modelo.Guitarra;
import com.softtek.modelo.InstrumentoMusical;

public class PruebaInstrumentos {
    public static void main(String[] args) {
        InstrumentoMusical guido = new Guitarra("Yamaha","tela");

        InstrumentoMusical bataca = new Bateria("Yamaha",6);

        InstrumentoMusical ham = new Flauta("Yamaha","plastico");

        InstrumentoMusical[] instrumentos = {guido,bataca,ham};

        for (InstrumentoMusical instrumento : instrumentos){
            System.out.println(instrumento.emitirSonido());
        }
    }
}
