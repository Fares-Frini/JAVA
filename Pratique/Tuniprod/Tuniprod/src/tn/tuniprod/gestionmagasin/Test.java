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
public class Test {
    
    public static void main(String[] args) {
        ProduitAlimentaire p1 = new ProduitAlimentaire();
        ProduitAlimentaire p2 = new ProduitAlimentaire(1021, "Lait", "Delice");
        ProduitAlimentaire p3 = new ProduitAlimentaire(2510, "Yaourt", "Vitalait");
        ProduitAlimentaire p4 = new ProduitAlimentaire(3250, "Tomate", "Sicam", 1.200f);
//        p1.afficher();
//        p2.afficher();
//        p3.afficher();
//        p4.afficher();
//        p2.prix=0.700f;
//        p2.afficher();
//        p3.prix=0.500f;
//        p3.afficher();

        System.out.println(p2);
        p2.setExpiration(new Date());
        System.out.println(p2);
    }

}
