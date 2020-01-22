/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package injeccio_dependecies;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuari
 */
public class ClientTest {
    
    public ClientTest() {
    }

    @Test
    public void testAssignarDescompte() {
        MissatgerFactory.getInstance().setMode(false);
        
        Client c = new Client(12, "Paco", "paco@iesmila.net");
         c.assignarDescompte(12);
    }
    
}
