package com.example.comptes;

public class ComptePayant  extends Compte{
    // Frais fixes pour chaque dépôt ou retrait
    private final double frais = 5.0;

    // Constructeur sans paramètre
    public ComptePayant() {
        super();
    }

    // Constructeur avec solde initial
    public ComptePayant(double soldeInitial) {
        super(soldeInitial);
    }

    // Redéfinition de la méthode deposer pour inclure les frais
    @Override
    public void deposer(double montant) {
        if (montant > 0) {
            solde += montant - frais;
        }
    }

    // Redéfinition de la méthode retirer pour inclure les frais
    @Override
    public void retirer(double montant) {
        if (montant > 0 && solde >= (montant + frais)) {
            solde -= (montant + frais);
        }
    }

    // Méthode pour afficher les informations du compte payant sous forme de chaîne de caractères
    @Override
    public String toString() {
        return "ComptePayant [code=" + code + ", solde=" + solde + ", frais=" + frais + "]";
    }
}

