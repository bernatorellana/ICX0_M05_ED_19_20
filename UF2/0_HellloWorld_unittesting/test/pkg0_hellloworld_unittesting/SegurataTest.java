/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg0_hellloworld_unittesting;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuari
 */
public class SegurataTest {
    
    public SegurataTest() {
    }

    @Test
    public void testPotEntrar() {
        
        Segurata s = new Segurata();
        boolean passa;
        passa = s.potEntrar(16, true);
        assertEquals(true, passa );
        
        passa = s.potEntrar(16, false);
        assertEquals(true, passa );        
        
        passa = s.potEntrar(15, false);
        assertEquals(false, passa );
        
        passa = s.potEntrar(15, true);
        assertEquals(true, passa );
    }
    
}
