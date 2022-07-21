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
public class VaccinAttenue implements Vaccin {

    @Override
    public boolean condition(Personne p, LocalDate dateCourante) {
        return true ;
    }
}
