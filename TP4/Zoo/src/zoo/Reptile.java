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
public abstract class Reptile extends Animal {
    private static int nbRept = 0 ;
    private boolean venimeux;

    public Reptile(boolean venimeux) {
        this.venimeux = venimeux;
        this.nbRept += 1 ;
    }
    
    public int getNbRept(){
        return this.nbRept ;
    }
}
