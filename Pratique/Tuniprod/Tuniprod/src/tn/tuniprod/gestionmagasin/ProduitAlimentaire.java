package tn.tuniprod.gestionmagasin;


import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fares
 */
public class ProduitAlimentaire {

    private int id;
    private String libelle;
    private String marque;
    private float prix;
    private Date expiration;

    public int getId() {
        return id;
    }

    public String getLibelle() {
        return libelle;
    }

    public String getMarque() {
        return marque;
    }

    public float getPrix() {
        return prix;
    }

    public Date getExpiration() {
        return expiration;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public void setExpiration(Date expiration) {
        this.expiration = expiration;
    }
    
    

    public ProduitAlimentaire() {
    }

    public ProduitAlimentaire(int id, String libelle, String marque) {
        this.id = id;
        this.libelle = libelle;
        this.marque = marque;
    }

    public ProduitAlimentaire(int id, String libelle, String marque, float prix) {
        this.id = id;
        this.libelle = libelle;
        this.marque = marque;
        this.prix = prix;
    }

    void afficher()
    {
        System.out.println("Produit numéro: "+id+" de la marque : "+marque
                +" du Type: "+libelle+"prix: " +prix);
        
    }

  @Override 
    public String toString() {
        
        return "Produit numéro: "+id+" de la marque : "+marque
                +" du Type: "+libelle+" prix: " + prix +" Date: "+expiration;
        
    }
    
    
}
