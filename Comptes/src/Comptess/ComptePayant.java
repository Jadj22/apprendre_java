/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comptess;

/**
 *
 * @author DELL
 */
public class ComptePayant extends Compte {
    private final double frais = 5.0;

    public ComptePayant() {
        super();
    }

    public  ComptePayant(double soldeInitial){
        super(soldeInitial);
    }

    @Override
    public void deposer(double montant) {
        if(montant > 0) {
            solde += (montant - frais);
        }
    }

    @Override
    public void retirer(double montant) {
        if(montant > 0 && solde >= montant){
            solde -= (montant + frais);
        }
    }

    @Override
    public String toString(){
        return "Le compte [code = "+code+" ,solde = "+solde+" frais = "+frais+"]";
    }

}
