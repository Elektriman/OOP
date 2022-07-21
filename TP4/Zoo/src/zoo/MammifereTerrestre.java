/**
 * Classe représentant un mammifere terrestre caracterise par :
 * - un nom d'espece,
 * - un indicateur booleen precisant si le mammifere est carnivore
 * - un nom d'habitat (biotope).
 */
package zoo;

public class MammifereTerrestre implements Mammifere_I, Terrestre{

    private String nomEspece;
    private String habitat;
    private boolean carnivore ;

    public MammifereTerrestre(String nom, boolean carnivore, String habitat) {
        this.carnivore = carnivore ;
        this.nomEspece = nom;
        this.habitat = habitat;
    }

    @Override
    public boolean estCarnivore() {
        return this.carnivore ;
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