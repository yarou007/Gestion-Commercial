/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestioncommercial;

/**
 *
 * @author hammi
 */
public class Fournisseur extends Personne {
    private String specialiste;

    public Fournisseur(int idnet, String nomsocial, String adresse,String specialiste) {
        super(idnet, nomsocial, adresse);
        this.specialiste = specialiste;
    }
    public Fournisseur(Personne p, String specialiste){
        super(p.idnet,p.nomsocial,p.adresse);
        this.specialiste=specialiste;
    }

    public String getSpecialiste() {
        return specialiste;
    }

    public void setSpecialiste(String specialiste) {
        this.specialiste = specialiste;
    }
      @Override
    public void Affiche(){
       super.Affiche();
          System.out.println(" Specialiste : "+specialiste+"}");
    }
    
    
}
