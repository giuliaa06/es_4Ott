package com.example;

public class Main {
    public static void main(String[] args) {
        
    ListaCavalli lista = new ListaCavalli();
    Classifica classifica = new Classifica();
    for (int i = 0; i < 20; i++){
        Cavallo c = new Cavallo("Cavallo" + i,classifica) ;
        lista.add(c);
    }


    }
}