/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package injeccio_dependecies;

/**
 *
 * @author Usuari
 */
public class ExempleFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Client c = new Client(12, "Paco", "paco@iesmila.net");
        Missatger m = new Missatger();
        c.assignarDescompte(12,m);
        
    }
    
}
