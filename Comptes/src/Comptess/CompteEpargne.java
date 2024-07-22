/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comptess;

/**
 *
 * @author DELL
 */
public class CompteEpargne extends Compte{
    private double tauxInteret = 0.06;
    
    public CompteEpargne(double tauxInteret){
        super();
        this.tauxInteret = tauxInteret;
    }
    
    public CompteEpargne(double soldeInitial, double tauxInteret){
        super(soldeInitial);
        this.tauxInteret = tauxInteret;
    }
    
    public void calculerInteret() {
        solde += solde * tauxInteret /100;
    }

    @Override
    public String toString(){
        return "Le compte [ code = "+ code + ", solde = "+solde+" , taux d'intérêt = "+tauxInteret+"]";
    }
}
