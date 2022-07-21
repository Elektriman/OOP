/**
 * Classe représentant un reptile aquatique caracterise par :
 * - un nom d'espece,
 * - un indicateur booleen precisant si le reptile est venimeux,
 * - un indicateur booleen precisant si le reptile evolue dans l'eau douce.
 */
package zoo;

public class ReptileAquatique implements Reptile_I, Aquatique {

    private String nomEspece;
    private boolean eauDouce;
    private boolean venimeux ;

    public ReptileAquatique(String nom, boolean venimeux, boolean eauDouce) {
        this.venimeux = venimeux ;
        this.nomEspece = nom;
        this.eauDouce = eauDouce;
    }

    @Override
    public boolean estVenimeux() {
        return this.venimeux ;
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
