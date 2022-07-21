/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covid;
import java.time.LocalDate ;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Julien
 */
public abstract class Personne {
    private String nom ;
    private String prenom ;
    private LocalDate DDN ;
    private LocalDate dateContamination ;
    private List<CovidTest> depistagesEffectues = new ArrayList() ;

    public Personne(String nom, String prenom, LocalDate DDN) {
        this.nom = nom;
        this.prenom = prenom;
        this.DDN = DDN;
    }
    
    //Getter
    public String donneNom() {
        return nom;
    }

    public String donnePrenom() {
        return prenom;
    }

    public LocalDate donneDateNaissance() {
        return DDN;
    }
    
    //duree d'isolement
    public abstract int dureeIsolement();
    
    //fonction de contamination
    
    public void devientContamine(LocalDate dateContamination){
        this.dateContamination = dateContamination ;
    }
    
    public boolean donneEtatContamination(LocalDate dateCourante){
        if(this.dateContamination != null){
            return this.dateContamination.compareTo(dateCourante) < 0 ;
        }
        return false ;
    }
    
    public CovidTest seFaireDepister(LocalDate dateDepistage, Soignant soignant, TypeCovidTest type){
        CovidTest Ctest = new CovidTest(this, soignant, dateDepistage, type) ;
        if(this.depistagesEffectues.isEmpty()){
            this.depistagesEffectues.add(Ctest);
        } else {
            int i = 0 ;
            while(this.depistagesEffectues.get(i).donneDate().compareTo(dateDepistage)>0 && i<this.depistagesEffectues.size()){
                i++ ;
            }
            this.depistagesEffectues.add(i, Ctest);
        }
        return Ctest ;
    }

    public List<CovidTest> getDepistagesEffectues() {
        return depistagesEffectues;
    }
    
    public EtatSanitaire donneEtatSanitaire(Date dateDemandeEtat){
        for(CovidTest Ct : this.depistagesEffectues){
            
        }
    }
}
