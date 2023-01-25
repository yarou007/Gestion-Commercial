/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestioncommercial;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;
import java.util.Vector;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Calendar;

/**
 *
 * @author hammi
 */
public class Commercial {

    static Vector<Personne> clients = new Vector<Personne>();
    static Vector<Article> articles = new Vector<Article>();
    static Vector<Commande> commandes = new Vector<Commande>();
    static Vector<Ligne> ligne = new Vector<Ligne>();

    public void PasserCommande(Commande c) {

        for (Personne cl : clients) {
            if (cl.idnet == c.getClient().idnet) {
                commandes.add(c);
                System.out.println("L'addition de commande a été affecté");
            }
            else {
                
            }
        }
        for (Commande cx:commandes){
            cx.Affiche();
        }
    }

    public void AnnulerCommande(Commande c) {
        System.out.println("Le taille commande " + commandes.size());
        Commande cx = null;
        for (Commande cm : commandes) {
            if (cm.getNumComm() == c.getNumComm()) {
                cx = cm;
            }
        }
        if (commandes.remove(cx)) {
            System.out.println("Le commande a été supprimer ");
        } else {
            System.out.println("Le commande pas trouvable");
        }
        System.out.println("Le taille commande " + commandes.size());
    }

    public void AjouterArticle(Article a) {
        articles.add(a);
        System.out.println("Ajouter succés");

    }

    public void SupprimerArticle(Article a) {
        Article ax = null;
        System.out.println("Taille: " + articles.size());
        for (Article as : articles) {
            if (as.getReference() == a.getReference()) {
                ax = as;
            }
        }
        boolean ok = articles.remove(ax);
        if (ok) {
            System.out.println("Le suppression d'article a été affecté");
        } else {
            System.out.println("Article pas trouvable");
        }
        System.out.println("Taille: " + articles.size());
    }

    public void AjouterClient(Client cl) {
        clients.add(cl);
        for (Personne c : clients) {
            c.Affiche();
        }

    }

    public void SupprimerClient(Client cl) {
        Personne ax = null;
        System.out.println("Taille: " + clients.size());
        for (Personne ps : clients) {
            if (ps.getIdnet() == cl.idnet) {
                ax = ps;
            }
        }
        boolean ok = clients.remove(ax);
        if (ok) {
            System.out.println("Le suppression de personne a été affecté");
        } else {
            System.out.println("Personne pas trouvable");
        }
        System.out.println("Taille: " + clients.size());
    }

    public void Afficher() {
        for (Article ax : articles) {
            ax.Affiche();
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Commercial C1 = new Commercial();
        Scanner main_clavier = new Scanner(System.in);
        int rep;

        do {
            System.out.println("------------Gestion Commerciale-------------");
            System.out.println("1)Ajouter un Article");
            System.out.println("2)Supprimer un Article");
            System.out.println("3)Ajouter un Client ");
            System.out.println("4)Supprimer un Client");
            System.out.println("5)Passer une commande ");
            System.out.println("6)Annuler une cimmande");
            System.out.println("0) Quitter");

            System.out.println("Enter votre choix: ");
            rep = main_clavier.nextInt();

            switch (rep) {
                case 1:
                    Article art;
                    System.out.println("Donner reference :");
                    int ref = main_clavier.nextInt();
                    System.out.println("Donner desgination :");
                    String des = main_clavier.nextLine();
                    des = main_clavier.nextLine();
                    /* i duplicated the assigned variable because of display problems but this solution works
                      previous solution :  String des = main_clavier.nextLine(); display without passing and stocing designation*/
                    System.out.println("Donner prixUnitaire :");
                    double pu = main_clavier.nextDouble();
                    System.out.println("Donner quantiteStock :");
                    int qs = main_clavier.nextInt();
                    art = new Article(ref, des, pu, qs);
                    C1.AjouterArticle(art);
                    C1.Afficher();

                    break;
                case 2:
                    System.out.println("Enter l'article reference pour supprimer ");
                    int art_ref_supp = main_clavier.nextInt();
                    Article art_supp = new Article(art_ref_supp, null, 0, 0);
                    C1.SupprimerArticle(art_supp);
                    break;
                case 3:
                    Client client;
                    System.out.println("Donner id :");
                    int idnet_cl = main_clavier.nextInt();
                    System.out.println("Donner nom social :");
                    String nomsocial_cl = main_clavier.nextLine();
                    nomsocial_cl = main_clavier.nextLine();
                    /* i duplicated the assigned variable because of display problems but this solution works
                     previous solution :  String nomsocial_cl = main_clavier.nextLine(); display without passing by nomsocial_cl*/
                    System.out.println("Donner adresse :");
                    String adr_cl = main_clavier.nextLine();
                    
                    System.out.println("Donner Chiffre d'affaire :");
                    int chiff_cl = main_clavier.nextInt();
                    client = new Client(idnet_cl, nomsocial_cl, adr_cl, chiff_cl);
                    C1.AjouterClient(client);

                    break;
                case 4:
                    System.out.println("Enter l'ID DE client pour supprimer ");
                    int id_pers_supp = main_clavier.nextInt();

                    Client pers_supp = new Client(id_pers_supp, null, null, 0);
                    C1.SupprimerClient(pers_supp);

                    break;
                case 5:
                    System.out.println("Donner num commande ");
                    int numCom = main_clavier.nextInt();
                    SimpleDateFormat dtf = new SimpleDateFormat("yyyy/MM/dd");
                    Calendar calendar = Calendar.getInstance();
                    Date demp = (Date) calendar.getTime();
                    System.out.println("Donner ID client  qui va commander : ");
                    int id_cl_com = main_clavier.nextInt();
                    Client cl_com = new Client(id_cl_com, null, null, 0);
                    Commande cm = new Commande(numCom, demp, cl_com);
                    C1.PasserCommande(cm);
                    break;
                case 6:
                    System.out.println("Donner num commande pour annuler");
                    int numComAnnul = main_clavier.nextInt();
                    Commande cm_Annu = new Commande(numComAnnul, null, null);
                    C1.AnnulerCommande(cm_Annu);
                    break;

                default:
                    System.out.println("Choix invalide");

            }
        } while (rep != 0);

    }
}
