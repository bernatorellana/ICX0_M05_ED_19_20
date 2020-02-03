/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.iesmila.ED.UF2.capsa_blanca;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuari
 */
public class TheIncredibleMachineTest {
    
    public TheIncredibleMachineTest() {
    }

    @Test
    public void testCrunch() {
        
        TheIncredibleMachine tim = new TheIncredibleMachine();
        
        int [] dades2 = {7,9,12,-2};
        tim.crunch(dades2);
        
        int [] dades = {7,7,7,7,7,7,5,5,5,5,4,4,4,4,3,3,3,3,1,10,1,3};
        tim.crunch(dades);
        
        
        
    }
    
}
