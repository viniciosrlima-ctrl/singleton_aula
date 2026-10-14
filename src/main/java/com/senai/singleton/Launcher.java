package com.senai.singleton;

import com.senai.singleton.Entidades.Carro;
import com.senai.singleton.Entidades.Singleton;
import com.senai.singleton.Entidades.Teste;
import javafx.application.Application;

import java.util.ArrayList;

public class Launcher {
    public static void main(String[] args) {
        Carro c1 = new Carro("Prata", "civic EX Manual Vtec", "honda", 1999);
        Carro c2 = new Carro("preto", "VW Beattle TSI EA888", "Volkswagen", 2014);
        Carro c3 = new Carro("Laranja", "787B", "Mazda", 1979);
     //   Application.launch(HelloApplication.class, args);
        Singleton.getInstancia().carros.add(c1);
        Singleton.getInstancia().carros.add(c2);
        Singleton.getInstancia().carros.add(c3);


        Teste teste = new Teste();
        teste.testar();




    }

}
