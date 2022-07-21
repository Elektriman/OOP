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
public class Particulier extends Client {
    private String prenom ;

    public Particulier(String nom, String prenom, String adresse) {
        super(nom, adresse);
        this.prenom = prenom;
    }
}
