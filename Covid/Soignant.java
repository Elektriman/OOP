/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.time.LocalDate;

/**
 *
 * @author Julien
 */
public class Soignant extends Personne {
    private int numPS ;

    public Soignant(String nom, String prenom, LocalDate DDN, int numPS) {
        super(nom, prenom, DDN);
        this.numPS = numPS;
    }

    public int donneNumPS() {
        return numPS;
    }
    
    public int dureeIsolement(){
        return 7 ;
    }
    
}
