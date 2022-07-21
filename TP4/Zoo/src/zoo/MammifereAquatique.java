/**
 * Classe représentant un mammifere aquatique caracterise par :
 * - un nom d'espece,
 * - un indicateur booleen precisant si le mammifere est carnivore,
 * - un indicateur booleen precisant si le mammifere evolue dans l'eau douce.
 */
package zoo;

public class MammifereAquatique implements Mammifere_I, Aquatique {

    private String nomEspece;
    private boolean eauDouce;
    private boolean carnivore ;

    public MammifereAquatique(String nom, boolean carnivore, boolean eauDouce) {
        this.carnivore = carnivore ;
        this.nomEspece = nom;
        this.eauDouce = eauDouce;
    }

    @Override
    public boolean estCarnivore() {
        return this.carnivore ;
    }

    @Override
    public boolean eauDouce() {
        return this.eauDouce ;
    }

    @Override
    public String donneNom() {
        return this.nomEspece ;
    }
}
