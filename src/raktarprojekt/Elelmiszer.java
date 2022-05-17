
package raktarprojekt;

import java.text.Collator;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;


class NevComparator implements Comparator<Elelmiszer>{
    

    @Override
    public int compare(Elelmiszer o1, Elelmiszer o2) {
        Collator coll = Collator.getInstance();
        
        return coll.compare(o1.getNev(), o2.getNev());
    }
}

class GyartoComparator implements Comparator<Elelmiszer>{
    

    @Override
    public int compare(Elelmiszer o1, Elelmiszer o2) {
        Collator coll = Collator.getInstance();

        return coll.compare(o1.getGyarto(), o2.getGyarto());
    }
}


abstract public class Elelmiszer {
private String nev;
private String gyarto;
private LocalDate lejaratidaum;

    public Elelmiszer(String nev, String gyarto, LocalDate lejaratidaum) {
        this.nev = nev;
        this.gyarto = gyarto;
        if(lejaratidaum.isBefore(LocalDate.now())){
            try {
                throw new HibasExpection("Lejárt élelmiszer");
            } catch (HibasExpection ex) {
                Logger.getLogger(Elelmiszer.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    
    }

    public String getNev() {
        return nev;
    }

    public String getGyarto() {
        return gyarto;
    }

    @Override
    public String toString() {
        return "Elelmiszer{" + "nev=" + nev + ", gyarto=" + gyarto + ", lejaratidaum=" + lejaratidaum + '}';
    }
    

    
}
