/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covid;

/**
 *
 * @author Julien
 */
import java.time.LocalDate;
public interface Vaccin {
    boolean condition(Personne p, LocalDate dateCourante);
}