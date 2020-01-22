package aillament;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bernat
 */
public class BotigaTest {
    

    /**
     * Test of compraProducte method, of class Botiga.
     */
    @Test
    public void testCompraProducte() {
      
    
        Botiga b = new Botiga();
        // Cas 1 : producte 1 , que té stock 10,  val 10€  i té descompte especial 0€. 
        //
        //         * Compra normal, si que hi ha estoc
        int preu;
        preu = b.compraProducte(1, 4);
        assertEquals(preu, 4*10);
        
        // Cas 2 : producte 1 , que té stock 10, val 10€  i té descompte especial 0€.  
        //
        //         *  Compra en exc?s: NO hi ha prou estoc        
        preu = b.compraProducte(1, 400);
        assertEquals(preu, -1);
        
        // Cas 3 : producte 2 , que té stock 20, val 2€ i té descompte especial 1€
        //
        //         * Compra de poc volum
        preu = b.compraProducte(2, 2);
        assertEquals(preu, 2*2);        

        // Cas 4 : producte 2 , que té stock 20 i que val 2€ i descompte especial 1€
        //
        //         * Compra de molt volum que es veu afectada per descompte
        preu = b.compraProducte(2, 11);
        assertEquals(preu, 11*(2-1) );        

    }
    
}
