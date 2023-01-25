/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestioncommercial;

/**
 *
 * @author hammi
 */
public class Ligne {
    private Commande commande;
    private Article article;
    private int quantiteComm;

    public Ligne(Commande commande, Article article, int quantiteComm) {
        this.commande = commande;
        this.article = article;
        this.quantiteComm = quantiteComm;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public int getQuantiteComm() {
        return quantiteComm;
    }

    public void setQuantiteComm(int quantiteComm) {
        this.quantiteComm = quantiteComm;
    }
      
    
}
