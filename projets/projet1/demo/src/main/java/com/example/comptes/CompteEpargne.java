package com.example.comptes;

// La classe CompteEpargne hérite de Compte et ajoute des fonctionnalités spécifiques à un compte épargne
public class CompteEpargne extends Compte {
    // Taux d'intérêt pour le compte épargne
    private double tauxInteret;

    // Constructeur avec taux d'intérêt seulement
    public CompteEpargne(double tauxInteret) {
        super();
        this.tauxInteret = tauxInteret;
    }

    // Constructeur avec solde initial et taux d'intérêt
    public CompteEpargne(double soldeInitial, double tauxInteret) {
        super(soldeInitial);
        this.tauxInteret = tauxInteret;
    }

    // Méthode pour calculer et ajouter les intérêts au solde du compte
    public void calculInteret() {
        solde += solde * tauxInteret / 100;
    }

    // Méthode pour afficher les informations du compte épargne sous forme de chaîne de caractères
    @Override
    public String toString() {
        return "CompteEpargne [code=" + code + ", solde=" + solde + ", tauxInteret=" + tauxInteret + "]";
    }
}
