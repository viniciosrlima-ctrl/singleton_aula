package com.senai.singleton.Entidades;

public class Teste {
    public void testar (){

        for (Carro c : Singleton.getInstancia().carros){
            System.out.printf(c.getModelo());

        }



    }
}
