/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aparcalocomopuedas;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuari
 */
public class AparcaloComoPuedasTest {
    
    public AparcaloComoPuedasTest() {
    }

 
    @Test
    public void testBuscaLlocLliure() {
        // sóc estàtic :-S
        
        int pcc[] = {0,0,0};
        int plc[] = {400,400,400};
        boolean poc[] = {false,false,false};        
        // codi client erroni
        assertEquals( Parking.ERROR, AparcaloComoPuedas.buscaLlocLliure( 100, 400, pcc, plc, poc));
        assertEquals( Parking.ERROR, AparcaloComoPuedas.buscaLlocLliure( 0, 400, pcc, plc, poc));
        assertEquals( Parking.ERROR, AparcaloComoPuedas.buscaLlocLliure( -1, 400, pcc, plc, poc));
        

                
        
    }
    
}
