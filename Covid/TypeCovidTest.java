/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Julien
 */
public enum TypeCovidTest {
    RT_PCR, Antigenique, Salivaire, Serologique ;
    
    public int donneFiabilite(){
        switch(this){
            case RT_PCR :
                return 100 ;
            case Antigenique :
                return 71 ;
            case Salivaire :
                return 82 ;
            case Serologique :
                return 90 ;
            default :
                return -1 ;
        }
    }
}

