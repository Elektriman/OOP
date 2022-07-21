/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covid;

import java.util.List ;
import java.util.ArrayList ;
import java.util.Collection ;

/**
 *
 * @author Julien
 */
public class RegistreCovidTest {
    private ArrayList<CovidTest> registre = new ArrayList() ;
    
    public boolean enregistrer(CovidTest test){
        try {
            registre.add(test);
            return true;
        } catch(Exception e) {
            return false ;
        }
    }
    
    public List<CovidTest> donneListeTests(){
        return registre ;
    }
}
