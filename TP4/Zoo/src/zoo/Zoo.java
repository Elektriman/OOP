/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo;

import java.util.ArrayList;

/**
 *
 * @author Julien
 */
public class Zoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        ArrayList<Animal> animaux = new ArrayList();
        ArrayList<Animal_I> animaux = new ArrayList();
        
        MammifereTerrestre Lion = new MammifereTerrestre(null, true, null);
        MammifereAquatique Dauphin = new MammifereAquatique(null, true, true);
        ReptileTerrestre Iguane = new ReptileTerrestre(null, true, null);
        ReptileAquatique SerpentDeMer = new ReptileAquatique(null, true, true);
        
        animaux.add(Lion);
        animaux.add(Dauphin);
        animaux.add(Iguane);
        animaux.add(SerpentDeMer);
        
        long nbMamm = animaux.stream().filter(e -> e instanceof Mammifere_I).count() ;
        long nbRept = animaux.stream().filter(e -> e instanceof Reptile_I).count() ;
        long nbTerr = animaux.stream().filter(e -> e instanceof Terrestre).count() ;
        long nbAqua = animaux.stream().filter(e -> e instanceof Aquatique).count() ;
        
        System.out.println(nbMamm+", "+nbRept+", "+nbTerr+", "+nbAqua);
        
        System.out.println(animaux);
    }

}
