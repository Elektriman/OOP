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
public class Client {
    
    private static ArrayList<Client> listClients = new ArrayList();
    
    private String nom;
    private String adresse;
    private ArrayList<CompteBancaire> comptes = new ArrayList() ;
    
    public Client(String nom, String adresse){
        
    }
    
    private void cond_cons(String nom, String adresse){
        this.nom = nom ;
        this.adresse = adresse ;
    }
    
    public boolean ajouteCompte(CompteBancaire compte){
        if(compte.donneDetenteur()==this && comptes.size()<3 && !comptes.contains(compte)){
            comptes.add(compte);
            return true;
        } else {
            return false;
        }
    }
    
    public void changeAdresse(String adresse){
        this.adresse = adresse ;
    }
    
    public String donneAdresse(){
        return this.adresse ;
    }
    
    public ArrayList<CompteBancaire> donneComptes(){
        return this.comptes ;
    }
    
    public String donneNom(){
        return this.nom ;
    }
    
    public boolean supprimeCompte(int numCompte){
        for(int i=0; i<comptes.size(); i++){
            if(comptes.get(i).donneNumero()==numCompte){
                comptes.remove(i);
                return true ;
            }
        }
        return false ;
    }

    @Override
    public String toString() {
        String comptes_nums = "[" ;
        for(CompteBancaire cb : comptes){
            comptes_nums += Integer.toString(cb.donneNumero()) + ", " ;
        }
        comptes_nums = comptes_nums.substring(0, comptes_nums.length()-2) + "]";
        return "Client{" + "nom=" + nom + ", adresse=" + adresse + ", comptes=" + comptes_nums + "}";
    }
}
