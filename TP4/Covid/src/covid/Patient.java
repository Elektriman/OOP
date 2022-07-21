/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covid;

import java.time.LocalDate ;

/**
 *
 * @author Julien
 */
public class Patient extends Personne {
    private long numDossier ;

    public Patient(String nom, String prenom, LocalDate DDN, long numDossier) {
        super(nom, prenom, DDN);
        this.numDossier = numDossier;
    }

    public long donneNumDossier() {
        return numDossier;
    }
    
    public int dureeIsolement(){
        return 10 ;
    }
    
    public boolean vaccinCompatible(LocalDate date, Vaccin vac){
        return vac.condition(this, date) ;
    }
}
