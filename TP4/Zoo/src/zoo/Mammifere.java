/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo;

/**
 *
 * @author Julien
 */
public abstract class Mammifere extends Animal {
    private static int nbMamm = 0 ;
    private boolean carnivore;

    public Mammifere(boolean carnivore) {
        this.carnivore = carnivore;
        this.nbMamm += 1 ;
    }

    public static int getNbMamm() {
        return nbMamm;
    }
}
