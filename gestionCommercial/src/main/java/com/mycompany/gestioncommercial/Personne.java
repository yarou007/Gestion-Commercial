package com.mycompany.gestioncommercial;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hammi
 */
public abstract class Personne {
    protected int idnet;
    protected String nomsocial;
    protected String adresse;

    public Personne(int idnet, String nomsocial, String adresse) {
        this.idnet = idnet;
        this.nomsocial = nomsocial;
        this.adresse = adresse;
    }

    protected int getIdnet() {
        return idnet;
    }

    protected void setIdnet(int idnet) {
        this.idnet = idnet;
    }

    protected String getNomsocial() {
        return nomsocial;
    }

    protected void setNomsocial(String nomsocial) {
        this.nomsocial = nomsocial;
    }

    protected String getAdresse() {
        return adresse;
    }

    protected void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void Affiche(){
        System.out.print("Personne{" + "idnet=" + idnet + ", nomsocial=" + nomsocial + ", adresse= " + adresse );
    }
    
    
}
