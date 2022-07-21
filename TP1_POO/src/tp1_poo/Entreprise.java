/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1_poo;

/**
 *
 * @author Julien
 */
public class Entreprise extends Client {
    private String SIRET ;

    public Entreprise(String SIRET, String nom, String adresse) {
        super(nom, adresse);
        this.SIRET = SIRET;
    }
}
