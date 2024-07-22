package com.example;

import  com.example.comptes.Client;
import com.example.comptes.Compte;
import  com.example.comptes.CompteEpargne;
import com.example.comptes.ComptePayant;

public class Main {
    public static void main(String[] args) {
        // Création des comptes
        Compte compte1 = new Compte();
        CompteEpargne compteEpargne = new CompteEpargne(6);
        ComptePayant comptePayant = new ComptePayant();

        // Dépôts dans les comptes
        compte1.deposer(500);
        compteEpargne.deposer(1000);
        comptePayant.deposer(100);

        // Retraits des comptes
        compte1.retirer(100);
        compteEpargne.retirer(200);
        comptePayant.retirer(50);

        // Calcul des intérêts pour le compte épargne
        compteEpargne.calculInteret();

        // Affichage des soldes des comptes
        System.out.println(compte1);
        System.out.println(compteEpargne);
        System.out.println(comptePayant);

        // Création d'un client et ajout des comptes
        Client client = new Client(1, "GATO", "Koffi");
        client.ajouterCompte(compte1);
        client.ajouterCompte(compteEpargne);
        client.ajouterCompte(comptePayant);

        // Affichage des informations du client
        System.out.println(client);
    }
}
