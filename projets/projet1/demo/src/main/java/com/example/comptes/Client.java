package com.example.comptes;
import java.util.List;
import java.util.ArrayList;

// La classe Client représente un client qui peut posséder plusieurs comptes
public class Client {
    // Identifiant unique du client
    private int id;
    // Nom du client
    private String nom;
    // Prénom du client
    private String prenom;
    // Liste des comptes du client
    private List<Compte> comptes;

// Constructeur pour initialiser un client avec un identifiant, un nom et un prénom
public Client(int id, String nom, String prenom) {
    this.id = id;
    this.nom = nom;
    this.prenom = prenom;
    this.comptes = new ArrayList<>();
}

// Méthode pour obtenir l'identifiant du client
public int getId() {
    return id;
}

// Méthode pour obtenir le nom du client
public String getNom() {
    return nom;
}

// Méthode pour obtenir le prénom du client
public String getPrenom() {
    return prenom;
}

// Méthode pour obtenir la liste des comptes du client
public List<Compte> getComptes() {
    return comptes;
}

// Méthode pour ajouter un compte à la liste des comptes du client
public void ajouterCompte(Compte compte) {
    comptes.add(compte);
}

// Méthode pour afficher les informations du client et de ses comptes sous forme de chaîne de caractères
@Override
public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Client [id=").append(id).append(", nom=").append(nom).append(", prenom=").append(prenom).append("]\n");
    for (Compte compte : comptes) {
        sb.append(compte.toString()).append("\n");
    }
    return sb.toString();
}


}
