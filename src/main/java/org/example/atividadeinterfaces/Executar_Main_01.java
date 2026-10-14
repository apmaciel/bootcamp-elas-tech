package org.example.atividadeinterfaces;

import java.util.ArrayList;

public class Executar_Main_01 {

    static void main() {

        Cachorro bidu = new Cachorro();

        bidu.emitirSom();

        Gato salem = new Gato();

        salem.emitirSom();

        ArrayList<Animal> animais = new ArrayList<>();

        animais.add(new Cachorro());
        animais.add(new Gato());

        for (Animal a : animais){
            a.emitirSom();
        }
    }
}
