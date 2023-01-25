/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestioncommercial;

import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @author hammi
 */
public class Commande {
    private int numComm;
    private Date dateComm;
    private Client client;

    public Commande(int numComm, Date dateComm, Client client) {
        this.numComm = numComm;
        this.dateComm = dateComm;
        this.client = client;
    }

    public int getNumComm() {
        return numComm;
    }

    public void setNumComm(int numComm) {
        this.numComm = numComm;
    }

    public Date getDateComm() {
        return dateComm;
    }

    public void setDateComm(Date dateComm) {
        this.dateComm = dateComm;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

   
     
    public void Affiche(){
        System.out.println();
        System.out.print("Commande{" + "numComm=" + numComm + ", dateComm=" + dateComm + ", client=" + client);  
    }
}
