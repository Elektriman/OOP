/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1_poo;

/**
 *
 * @author Julien
 */
public class CompteBancaireRemunere extends CompteBancaire {
    private double tauxInteret = 0.03 ;
    
    public CompteBancaireRemunere(double soldeInitial, Client client){
        super(soldeInitial, client);
    }
    
    public CompteBancaireRemunere(double soldeInitial, double tauxInteret, Client client){
        super(soldeInitial, client);
        this.tauxInteret = tauxInteret ;
    }
    
    public CompteBancaireRemunere(Client client){
        super(0, client);
    }
    
    public void crediterInteretMensuel(){
        double interetAnnuel = this.consulter()*this.tauxInteret ;
        this.crediter(interetAnnuel/12);
    }
}
