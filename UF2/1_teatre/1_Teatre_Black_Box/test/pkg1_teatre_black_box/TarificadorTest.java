/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1_teatre_black_box;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuari
 */
public class TarificadorTest {

    public TarificadorTest() {
    }

    @Test
    public void testGetPreuForaDeRang() {
        Tarificador t = new Tarificador();
        testForaDeRang(t, -1, 20);
        testForaDeRang(t, 5, 20);
        testForaDeRang(t, 1, -1);
        testForaDeRang(t, 1, 120);
    }

    private void testForaDeRang(Tarificador t,
            int tipusSeient, int edat) {
        try {
            t.getPreu(tipusSeient, edat);

            fail("Fora de rang no controlat.");
            // Si arribo aquí malo!
        } catch (IllegalArgumentException ex) {

        }
    }

    @Test
    public void testGetPreu() {
        Tarificador t = new Tarificador();
        assertEquals(0, t.getPreu(1, 2), 0.009);
        assertEquals(0, t.getPreu(1, 2), 0.009);
        assertEquals(45, t.getPreu(1, 8), 0.009);
        assertEquals(60, t.getPreu(1, 40), 0.009);
        assertEquals(30, t.getPreu(1, 65), 0.009);
        assertEquals(45, t.getPreu(1, 4), 0.009);
        assertEquals(60, t.getPreu(1, 12), 0.009);
        assertEquals(30, t.getPreu(1, 60), 0.009);
        assertEquals(0, t.getPreu(1, 3), 0.009);
        assertEquals(45, t.getPreu(1, 11), 0.009);
        assertEquals(60, t.getPreu(1, 59), 0.009);
        assertEquals(0, t.getPreu(2, 2), 0.009);
        assertEquals(37.5, t.getPreu(2, 8), 0.009);
        assertEquals(50, t.getPreu(2, 40), 0.009);
        assertEquals(10, t.getPreu(2, 65), 0.009);
        assertEquals(37.5, t.getPreu(2, 4), 0.009);
        assertEquals(50, t.getPreu(2, 12), 0.009);
        assertEquals(10, t.getPreu(2, 60), 0.009);
        assertEquals(0, t.getPreu(2, 3), 0.009);
        assertEquals(37.5, t.getPreu(2, 11), 0.009);
        assertEquals(50, t.getPreu(2, 59), 0.009);
        assertEquals(0, t.getPreu(3, 2), 0.009);
        assertEquals(30, t.getPreu(3, 8), 0.009);
        assertEquals(40, t.getPreu(3, 40), 0.009);
        assertEquals(8, t.getPreu(3, 65), 0.009);
        assertEquals(30, t.getPreu(3, 4), 0.009);
        assertEquals(40, t.getPreu(3, 12), 0.009);
        assertEquals(8, t.getPreu(3, 60), 0.009);
        assertEquals(0, t.getPreu(3, 3), 0.009);
        assertEquals(30, t.getPreu(3, 11), 0.009);
        assertEquals(40, t.getPreu(3, 59), 0.009);
        assertEquals(0, t.getPreu(4, 2), 0.009);
        assertEquals(22.5, t.getPreu(4, 8), 0.009);
        assertEquals(30, t.getPreu(4, 40), 0.009);
        assertEquals(6, t.getPreu(4, 65), 0.009);
        assertEquals(22.5, t.getPreu(4, 4), 0.009);
        assertEquals(30, t.getPreu(4, 12), 0.009);
        assertEquals(6, t.getPreu(4, 60), 0.009);
        assertEquals(0, t.getPreu(4, 3), 0.009);
        assertEquals(22.5, t.getPreu(4, 11), 0.009);
        assertEquals(30, t.getPreu(4, 59), 0.009);

        //---------------------
    }

}
