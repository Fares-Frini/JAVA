
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

    int id;
    String libelle;
    String marque;
    float prix;
    Date expiration;

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
