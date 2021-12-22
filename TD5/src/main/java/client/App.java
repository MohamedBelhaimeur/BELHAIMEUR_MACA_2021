package client;

import api.*;

public class App {
    public static void main(String[] args) {
        AttaqueStrategy attaqueCanon=new Canon();
        DeplacementStrategy voler=new Voler();

        Unite unite= new Unite(voler,attaqueCanon);
        unite.seDeplacer();
        unite.combattre();

        //on change de strategy
        AttaqueStrategy attaqueMissile=new Missile();
        DeplacementStrategy courir=new Courir();
        unite.setAttaque(attaqueMissile);
        unite.setDeplacement(courir);

        unite.seDeplacer();
        unite.combattre();

    }
}
