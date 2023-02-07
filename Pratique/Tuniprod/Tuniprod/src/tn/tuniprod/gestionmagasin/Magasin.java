package tn.tuniprod.gestionmagasin;


import tn.tuniprod.gestionmagasin.ProduitAlimentaire;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fares
 */
public class Magasin {

    int id, capacite;
    String adresse;
    ProduitAlimentaire[] produits;

    public Magasin() {
    }

    public Magasin(int id, String adresse) {
        this.id = id;
        this.adresse = adresse;
        this.produits = new ProduitAlimentaire[50];
    }

    public void ajouterProduit(ProduitAlimentaire p) {
        if (capacite < 50) {
            produits[capacite] = p;
            capacite++;
        } else {
            System.out.println("Capacité maximale atteinte");
        }
    }

    public void afficherMagasin() {
        String s = "Magasin N°: " + id + " Adresse: " + adresse + " Produits";
        for (int i = 0; i < capacite; i++) {
            s+="\n";
            s+= produits[i];
        }
        System.out.println(s);
    }

}
