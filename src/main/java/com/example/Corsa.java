package com.example;
import java.util.ArrayList;

public class Corsa {
    ArrayList<String> classifica;

    public Corsa(ArrayList<Cavallo> classifica) {
        this.classifica = new ArrayList();
    }

    public void arrivato(String nome){
        classifica.add(nome);
    }

    public String classificaFinale(){
        return classifica.toString();
    }

    public void addCorsa(Cavallo nomeCavallo){
        classifica.add(nomeCavallo);
    }

}
