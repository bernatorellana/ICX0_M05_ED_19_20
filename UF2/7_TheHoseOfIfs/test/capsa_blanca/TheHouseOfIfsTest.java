/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capsa_blanca;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuari
 */
public class TheHouseOfIfsTest {
    
    public TheHouseOfIfsTest() {
    }

    @Test
    public void testTheScrambler() {
        TheHouseOfIfs thoi = new TheHouseOfIfs();
        int numbers[] = {};
        String name = "";
        thoi.theScrambler(numbers, null);
        thoi.theScrambler(null, "");
        thoi.theScrambler(new int[]{1,2}, "123");
        thoi.theScrambler(new int[]{}, "");

        thoi.theScrambler(new int[]{1,4,2}, "abd");        
        
        thoi.theScrambler(new int[]{1,1,1}, "abd");        
        
        thoi.theScrambler(new int[]{0,1,2}, "abd");        
        thoi.theScrambler(new int[]{2,1,0}, "abd");     
        thoi.theScrambler(new int[]{2,0,1}, "abd");     
        
    }
    
}
