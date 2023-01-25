/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestioncommercial;

/**
 *
 * @author hammi
 */
public class Client extends Personne {
    private double chiffreAffaire;

    public Client( int idnet, String nomsocial, String adresse,double chiffreAffaire) {
        super(idnet, nomsocial, adresse);
        this.chiffreAffaire = chiffreAffaire;
    }

    public double getChiffreAffaire() {
        return chiffreAffaire;
    }

    public void setChiffreAffaire(double chiffreAffaire) {
        this.chiffreAffaire = chiffreAffaire;
    }
    @Override
    public void Affiche(){
        super.Affiche();
        System.out.println(" Chiffre d'affaire: "+chiffreAffaire+"}");
    }
    
}
