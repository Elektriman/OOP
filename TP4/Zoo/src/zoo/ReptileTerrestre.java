/**
 * Classe représentant un reptile terrestre caracterise par :
 * - un nom d'espece,
 * - un indicateur booleen precisant si le reptile est venimeux,
 * - un nom d'habitat (biotope).
 */
package zoo;

public class ReptileTerrestre implements Reptile_I, Terrestre {

    private String nomEspece;
    public String habitat;
    public boolean venimeux ;

    public ReptileTerrestre(String nom, boolean venimeux, String habitat) {
        this.nomEspece = nom ;
        this.venimeux = venimeux ;
        this.nomEspece = nom;
    }

    @Override
    public boolean estVenimeux() {
        return this.venimeux ;
    }

    @Override
    public String donneHabitat() {
        return this.habitat ;
    }
    
    @Override
    public String donneNom() {
        return this.nomEspece ;
    }
}
