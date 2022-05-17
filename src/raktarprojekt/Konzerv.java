/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raktarprojekt;

/**
 *
 * @author vizsgaszf
 */
public class Konzerv extends RaktarProjekt{
   private String szovegesAjanlas;
   private String recept;

    public Konzerv(String szovegesAjanlas) {
        this(szovegesAjanlas,"");
        this.szovegesAjanlas = szovegesAjanlas;
    }

    
    public Konzerv(String szovegesAjanlas, String recept) {
        this.szovegesAjanlas = szovegesAjanlas;
        this.recept = recept;
    }

    @Override
    public String toString() {
        return "Konzerv{" + "szovegesAjanlas=" + szovegesAjanlas + ", recept=" + recept + '}';
    }
    
    
}
