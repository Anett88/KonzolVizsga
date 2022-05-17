
package raktarprojekt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class RaktarProjekt {

    
    public static void main(String[] args) throws IOException {
        
        ArrayList<Elelmiszer> lista = null;
        Raktar raktar =new Raktar(lista);
        
        
        
        
        try {
            
            ObjectOutputStream objKi = new ObjectOutputStream(new FileOutputStream("raktar.bin"));
            objKi.writeObject(raktar);
            objKi.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(RaktarProjekt.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException ex) {
            Logger.getLogger(RaktarProjekt.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
         
    }
 
    
    
    

