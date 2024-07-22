/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comptess;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class Client {
    private int id;
    private String nom;
    private String prenom;
    private List<Compte>Comptess;

    public Client(int id, String nom, String prenom){
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.comptess = new ArrayList<>();
    }

        public int getId(){
            return id;
        }

        public String getNom(){
            return nom;
        }

        public String getPrenom(){
            return prenom;
        }

        public List<Compte> getComptess(){
            return comptess;
        }


        public void ajouterCompte(Compte compte) {
            comptess.add(compte);
        }

        @Override
        public String toString() {
            String result = "Client [id=" + id + ", nom=" + nom + ", prenom=" + prenom + "]\n";
            for (Compte compte : comptess) {
                result += compte.toString() + "\n";
            }
            return result;
        }


}
