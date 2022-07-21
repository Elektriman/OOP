/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comptebanquaire;
import java.util.ArrayList ;
import java.util.Collections ;

/**
 *
 * @author Julien
 */
public class CompteBancaire {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<CompteBancaireInitial> comptes = new ArrayList();
        for(int i=0; i<10; i++){
            int r = (int) (100*Math.random());
            comptes.add(new CompteBancaireInitial(0.0, r, null));
        }
        affiche(comptes);
        Collections.sort(comptes);
        affiche(comptes);
    }
    
    public static void affiche(ArrayList tab){
        String res = "[" ;
        for(int i=0; i<tab.size(); i++){
            CompteBancaireInitial CBI = (CompteBancaireInitial) tab.get(i) ;
            res +=  CBI.donneNumero() + ", " ;
        }
        System.out.println(res.substring(0, res.length()-2)+"]");
    }
}
