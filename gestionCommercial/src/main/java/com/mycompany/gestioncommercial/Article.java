/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestioncommercial;

/**
 *
 * @author hammi
 */
public class Article {
    private int reference;
    private String desgination;
    private double prixUnitaire;
    private int quantiteStock;

    public Article(int reference, String desgination, double prixUnitaire, int quantiteStock) {
        this.reference = reference;
        this.desgination = desgination;
        this.prixUnitaire = prixUnitaire;
        this.quantiteStock = quantiteStock;
    }

    public int getReference() {
        return reference;
    }

    public void setReference(int reference) {
        this.reference = reference;
    }

    public String getDesgination() {
        return desgination;
    }

    public void setDesgination(String desgination) {
        this.desgination = desgination;
    }

    public double getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(double prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    public int getQuantiteStock() {
        return quantiteStock;
    }

    public void setQuantiteStock(int quantiteStock) {
        this.quantiteStock = quantiteStock;
    }

  
    public void Affiche(){
        System.out.println();
        System.out.print("Article{" + "reference=" + reference + ", desgination= " + this.desgination + ", prixUnitaire=" + prixUnitaire + ", quantiteStock=" + quantiteStock);
    }
        
    
}
