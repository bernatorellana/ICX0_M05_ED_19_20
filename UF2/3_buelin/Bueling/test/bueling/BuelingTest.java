/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bueling;

import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuari
 */
public class BuelingTest {

    public BuelingTest() {
    }

    @Test
    public void testGetSobrecostPerEquipatge_ValorsOK() {

        //--------------------------------------------
        // Sense sobrecost
        // a) Variacions del número de maletes
        int[][] pesosMaletes = {
            null,
            {},
            {20},
            {20, 20}
        };
        Bueling b = new Bueling();
        for (int i = 0; i < pesosMaletes.length; i++) {
            float s = b.getSobrecostPerEquipatge(null, 0, pesosMaletes[i], false);
            assertEquals(0, s, 0.001);
        }
        // b) Variacions a l'equipatge de mà

        assertEquals(0, b.getSobrecostPerEquipatge(null, 100, new int[0], false), 0.001);
        assertEquals(0, b.getSobrecostPerEquipatge(new int[]{30, 30, 30}, 20, new int[0], false), 0.001);

        //--------------------------------------------
        //   Sobrecost per maletes
        final float sobrecostKilo = 20;
        final float sobrecostKiloTotal = 10;
        assertEquals(1 * sobrecostKilo, b.getSobrecostPerEquipatge(null, 0, new int[]{21}, false), 0.001);
        assertEquals(2 * sobrecostKilo, b.getSobrecostPerEquipatge(null, 0, new int[]{21, 21}, false), 0.001);
        assertEquals(1 * sobrecostKilo + sobrecostKiloTotal * 10, b.getSobrecostPerEquipatge(null, 0, new int[]{21, 20, 10}, false), 0.001);
        //--------------------------------------------
        //  Sobrecost per equipatge de mà
        int[][] midesEquipatgeMa = {
            {31, 30, 30},
            {30, 31, 30},
            {30, 30, 31},
            {31, 31, 31}
        };
        int[] pesosEquipatgeMa = {20, 21};

        for (int i = 0; i < pesosEquipatgeMa.length; i++) {
            for (int k = 0; k < midesEquipatgeMa.length; k++) {
                float s = 60;
                if (pesosEquipatgeMa[i] > 20) {
                    s += (pesosEquipatgeMa[i] - 20) * 20;
                }
                assertEquals(s, b.getSobrecostPerEquipatge(
                        midesEquipatgeMa[k],
                        pesosEquipatgeMa[i],
                        new int[]{}, false), 0.001);

            }
        }
        //------------------------------------------
        // Test pagament amb tarja        
        assertEquals(0, b.getSobrecostPerEquipatge(
                        null,
                        0,
                        new int[]{}, true), 0.001);
        
        assertEquals(20 + 2 , b.getSobrecostPerEquipatge(
                        null,
                        0,
                        new int[]{21}, true), 0.001);
        
    }

    @Test
    public void testGetSobrecostPerEquipatge_ValorsErronis() {
        // això és un array d'arrays
        int midesEquipatge[][] = {
            {1}, {1, 2}, {1, 2, 3, 4}, // faltan dimensions o sobren dimensions
            {-1, 1, 1}, {1, -1, 1}, {1, 1, -1}, // dimensions negatives
            {0, 1, 1}, {1, 0, 1}, {1, 1, 0}, // dimensions a zero
            {-1, -1, -1}, {0, 0, 0} // tot a negatiu o dimensions a zero
        };
        /**
         * *
         *
         * HOW TO CREATE ARRAYS "ON THE FLY"
         *
         * new int[] {1,2,3,4,5}
         *
         * Crea una taula de ints amb inicialització directa !
         *
         */

        for (int i = 0; i < midesEquipatge.length; i++) {
            provaPetada(midesEquipatge[i], 20, new int[0], false);
        }
        //----------------------------------------------------
        // Proves amb pesos erronis d'equipatge de mà ( 0 i -1) 
        provaPetada(new int[]{10, 10, 10}, 0, new int[0], false);
        provaPetada(new int[]{10, 10, 10}, -1, new int[0], false);

        //----------------------------------------------------
        // Proves amb llista de maletes errònies
        provaPetada(new int[]{10, 10, 10}, 10, new int[]{-1}, false);
        provaPetada(new int[]{10, 10, 10}, 10, new int[]{0}, false);
        provaPetada(new int[]{10, 10, 10}, 10, new int[]{10, 0}, false);
        provaPetada(new int[]{10, 10, 10}, 10, new int[]{10, -1}, false);

    }

    private void provaPetada(int[] midesEquipatge, int pesMa, int[] maletes, boolean visa) {
        //---------------------------------
        try {
            Bueling b = new Bueling();
            b.getSobrecostPerEquipatge(midesEquipatge, pesMa, maletes, visa);
            fail("getSobrecostPerEquipatge ha de llançar una Excepció :" + Arrays.toString(midesEquipatge));
        } catch (Exception ex) {
            // Tot ha anat bé :-)
        }
    }

}
