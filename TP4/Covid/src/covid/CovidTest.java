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
public class CovidTest {
    private Personne personne ;
    private Soignant testeur ;
    private LocalDate date ;
    private boolean resultat ;
    private TypeCovidTest type ;

    public CovidTest(Personne personne, Soignant testeur, LocalDate date, TypeCovidTest type) {
        this.personne = personne;
        this.testeur = testeur;
        this.date = date;
        this.resultat = personne.donneEtatContamination(date) ;
        this.type = type ;
    }

    public Personne donnePersonne() {
        return personne;
    }

    public Soignant donneTesteur() {
        return testeur;
    }

    public LocalDate donneDate() {
        return date;
    }

    public boolean donneResultat() {
        return resultat;
    }
}
