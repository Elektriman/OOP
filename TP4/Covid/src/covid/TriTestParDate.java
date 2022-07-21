/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covid;

import java.time.LocalDate;

/**
 *
 * @author Julien
 */
public class TriTestParDate implements Comparable {   

    @Override
    public int compareTo(Object t) {
        CovidTest test2 = (CovidTest) t ;
        if(this.donneDate().compareTo(test2.donneDate())>0){
            return 1 ;
        } else if(this.donneDate().compareTo(test2.donneDate())==0) {
            return 0 ;
        } else {
            return -1 ;
        }
    }
}
