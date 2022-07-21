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
public class Banque {
    public ArrayList<Client> clients = new ArrayList();
    private ArrayList<CompteBancaire> comptes = new ArrayList();
    private final String nom ;

    public Banque(String nom) {
        this.nom = nom ;
    }
    
    public void ajouterClient(Client client){
        this.clients.add(client);
    }
    
    public void ajouterCompte(CompteBancaire compte){
        this.comptes.add(compte);
    }
    
    public boolean supprimerClient(Client client){
        if(client.donneComptes().isEmpty()){
            this.clients.remove(client);
            return true ;
        } else {
            return false ;
        }
    }
    
    public static boolean memeBanque(Banque banque, CompteBancaire compte1, CompteBancaire compte2){
        return(banque.comptes.contains(compte1)&& banque.comptes.contains(compte2));
    }
    
    public boolean transferInterBanque(int numEmetteur, int numRecepteur, int montant){
        CompteBancaire emetteur = CompteBancaire.fromNum(numEmetteur);
        CompteBancaire recepteur = CompteBancaire.fromNum(numRecepteur);
        if(!memeBanque(this, emetteur, recepteur)){
            emetteur.debiter(5.0);
        }
        return emetteur.transferer(recepteur, montant);
    }
    
    public boolean clientExiste(String nom, String adresse){
        for(Client c : clients){
            if(c.donneNom().equals(nom) && c.donneAdresse().equals(adresse)){
                return true ;
            }
        }
        return false ;
    }

    Particulier creerParticulier(String nom, String prenom, String adresse) {
        if (clientExiste(nom, adresse)){
            return null ;
        } else {
            return new Particulier(nom, prenom, adresse) ;
        }
    }

    CompteBancaireRemunere creerCompteRemunere(int soldeInitial, double TauxInteret, Client client) {
        return new CompteBancaireRemunere(soldeInitial, TauxInteret, client);
    }
}
