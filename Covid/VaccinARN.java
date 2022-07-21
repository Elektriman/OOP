/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.time.LocalDate;

/**
 *
 * @author Julien
 */
public class VaccinARN implements Vaccin{
    private int ageLimite ;
    
    public VaccinARN(int age) {
        this.ageLimite = age ;
    }
    
    @Override
    public boolean condition(Personne p, LocalDate dateCourante) {
        int age = java.time.Period.between(p.donneDateNaissance(), dateCourante).getYears() ;
        return age > this.ageLimite && age > 0;
    }
}
