package com.example.comptes;


// La classe Compte représente un compte bancaire générique
public class Compte {
    
    // Attribut statique pour générer des codes uniques
    private static int compteur = 0;
    // Code unique du compte
    protected int code;
    // Solde actuel du compte
    protected double solde;

    // Constructeur sans paramètre qui initialise un compte avec un solde de 0
    public Compte() {
        this.code = ++compteur;
        this.solde = 0.0;
    }

    // Constructeur avec un solde initial
    public Compte(double soldeInitial) {
        this.code = ++compteur;
        this.solde = soldeInitial;
    }

    //Méthode pour obtenir le code du compte
    public int getCode() {
        return this.code;
    }

    //Méthode pour obtenir le solde du compte
    public double getSolde() {
        return this.solde;
    }

    //Méthode pour deposer de l'argwnt sur le compte
    public void deposer(double montant) {
        if (montant > 0){
            solde += montant;
        }
    }

    //Méthode pour retirer de l'argent du compte
    public void retirer(double montant) {
        if (montant > 0 && solde >= montant) {
            solde -= montant;
        }
    }


    //Méthode pour afficher les informations du comte sous forme de chaine de caractère
    @Override
    public String toString() {
        return  "Compte [code = " + code + ", solde = " + solde + "]";
    }

}
