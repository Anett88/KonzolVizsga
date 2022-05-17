
package raktarprojekt;

import java.util.ArrayList;


public class Raktar {
    private ArrayList<Elelmiszer> lista;

    public Raktar(ArrayList<Elelmiszer> lista) {
        this.lista = lista;
    }
    
    public void felvesz(Elelmiszer elelem){
        
        lista.add(elelem);
    }

    @Override
    public String toString() {
        return "Raktar{" + "lista=" + lista + '}';
    }
    
    
}
