/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covid;

import java.time.LocalDate;

/**
 *
 * @author Julien
 */
public class TriTestParNom extends CovidTest implements Comparable {

    public TriTestParNom(Personne personne, Soignant testeur, LocalDate date) {
        super(personne, testeur, date);
    }

    @Override
    public int compareTo(Object t) {
        CovidTest test2 = (CovidTest) t ;
        if(this.donnePersonne().donneNom().compareTo(test2.donnePersonne().donneNom())>0){
            return 1 ;
        } else if(this.donnePersonne().donneNom().compareTo(test2.donnePersonne().donneNom())==0) {
            return 0 ;
        } else {
            return -1 ;
        }
    }
}
