package com.example;

import java.util.ArrayList;

public class Cavallo extends Thread{
    private String nome;
    private int distanza = 100;
    ArrayList<Cavallo> classifica;

    public void run(){
        for ( int i = 0; i < distanza; i++){
            try {
                Thread.sleep((int) (Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            classifica.add(this);
        }

        

    }

    public Cavallo(String nome, int distanza, ArrayList<Cavallo> classifica) {
        this.nome = nome;
        this.distanza = distanza;
        this.classifica = new ArrayList();
    }

    public String getNome(){
        return nome;
    }
    
}
