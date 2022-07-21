/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1_poo;
import java.util.ArrayList ;

/**
 *
 * @author Julien
 */
public class CompteBancaire {
    
    private static ArrayList<CompteBancaire> ListComptes = new ArrayList() ;
    
    private double solde;
    private Client client;
    private int numero;
    
    public CompteBancaire(double soldeInitial, Client client){
        this.solde = soldeInitial ;
        this.client = client ;
        
        boolean flag = true ;
        for(int i=0; i<ListComptes.size(); i++){
            if(!numPris(i)){
                this.numero = i ;
                flag = false ;
                break ;
            }
        }
        if(flag){
            this.numero = ListComptes.size() ;
        }
    }
    
    public CompteBancaire(int numero, Client client){
        this.numero = numero ;
        this.client = client ;
        ListComptes.add(this);
    }
    
    public CompteBancaire(int numero, double soldeInitial, Client client){
        this.numero = numero ;
        this.solde = soldeInitial ;
        this.client = client ;
        ListComptes.add(this);
    }
    
    public double consulter(){
        return(this.solde);
    }
    
    public double crediter(double montant){
        this.solde += montant ;
        return this.solde ;
    }
    
    public double debiter(double montant){
        this.solde -= montant ;
        return this.solde ;
    }
    
    public Client donneDetenteur(){
        return this.client ;
    }
    
    public int donneNumero(){
        return this.numero ;
    }
    
    public static boolean numPris(int numero){
        for(CompteBancaire compte : ListComptes){
            if(compte.donneNumero()==numero){
                return false ;
            }
        }
        return true ;
    }
    
    public static CompteBancaire fromNum(int numero){
        for(CompteBancaire compte : ListComptes){
            if(compte.donneNumero()==numero){
                return compte ;
            }
        }
        return null ;
    }

    @Override
    public String toString() {
        return "CompteBanquaire{" + "solde=" + solde + ", client=" + client + ", numero=" + numero + "}";
    }
    
    public boolean transferer(CompteBancaire unCompte, int montantATransferer){
        try {
            double soldeEmetteur = this.consulter();
            double soldeRecepteur = unCompte.consulter();
            if (soldeEmetteur-this.debiter(montantATransferer)!=montantATransferer || unCompte.crediter(montantATransferer)-soldeRecepteur!=montantATransferer){
                throw new Exception("Erreur pendant le transfer d'argent");
            } else {
                return true ;
            }
        } catch(Exception e) {
            return false ;
        }
    }
}
