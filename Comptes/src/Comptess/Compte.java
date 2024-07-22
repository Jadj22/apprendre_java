/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comptess;

/**
 *
 * @author DELL
 */
public class Compte {
    private static int compteur=0;
    protected int code;
    protected double solde;
    
    public Compte(){
        this.code = ++compteur;
        this.solde = 0.0;
    }
    
    public Compte (double soldeInitial) {
        this.code = ++compteur;
        this.solde = soldeInitial;
    }
    
    public int getCode () {
        return this.code;
    }
    
    public double getSolde () {
        return this.solde;
    }
    
    public void deposer(double montant){
        if(montant > 0){
            solde += montant;
        }
    }
    
    public void retirer (double montant) {
        if(montant > 0 && solde >= montant){
            solde -= montant;
        }
    }
    
    @Override
    public String toString(){
        return "Le compte [code = "+code+", solde = "+solde+"]";
    }
    
}
