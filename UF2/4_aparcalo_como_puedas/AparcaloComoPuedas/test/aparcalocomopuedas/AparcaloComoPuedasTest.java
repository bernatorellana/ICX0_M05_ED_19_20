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
    public void testBuscaLlocLliure_ValorsValids() {
        int pcc[] = {0, 0, 0};
        int plc[] = {400, 400, 400};
        boolean poc[] = {false, false, false};
        //--------------------------------------
        // No client, no te lloc xq el cotxe és gran
        assertEquals(Parking.NO_HI_HA_LLOC, AparcaloComoPuedas.buscaLlocLliure(
                Parking.CODI_NO_CLIENT,
                401, pcc, plc, poc));
        // No client, no te lloc xq tot està ocupat
        int pcc_p2[] = {0, 0, 250};
        boolean poc_p2[] = {true, true, false};
        assertEquals(Parking.NO_HI_HA_LLOC, AparcaloComoPuedas.buscaLlocLliure(
                Parking.CODI_NO_CLIENT,
                350, pcc_p2, plc, poc_p2));
        // No és client i troba plaça ( la primera de les disponibles )
        boolean poc_p3[] = {true, false, false};
        assertEquals(1, AparcaloComoPuedas.buscaLlocLliure(
                Parking.CODI_NO_CLIENT,
                350, pcc, plc, poc_p3));
        //---------------------------------------------------------------
        // Si és client, no té lloc (cotxe gran)
        int codiClient = 666;
        int pcc_p4[] = {0, codiClient, codiClient};
        assertEquals(Parking.NO_HI_HA_LLOC, AparcaloComoPuedas.buscaLlocLliure(
                codiClient,
                401, pcc_p4, plc, poc));

        // Si és client, no té lloc (Tot ocupat (altres socis lliures, meves ocupades, i places ocupades)
        int pcc_p5[] = {0, codiClient, 250};
        boolean poc_p5[] = {true, true, false};

        assertEquals(Parking.NO_HI_HA_LLOC, AparcaloComoPuedas.buscaLlocLliure(
                codiClient,
                350, pcc_p5, plc, poc_p5));
        // Si és client, troba plaça a la primera de les seves places.
        int pcc_p6[] = {0, codiClient, codiClient};
        boolean poc_p6[] = {false, false, false};        
        assertEquals(  1  , AparcaloComoPuedas.buscaLlocLliure(
                codiClient,
                350, pcc_p6, plc, poc_p6));
        // Si és client, troba plaça a una plaça pública
        int pcc_p7[] =     {250, codiClient, 0};
        boolean poc_p7[] = {false, true, false};        
        assertEquals(  2  , AparcaloComoPuedas.buscaLlocLliure(
                codiClient,
                350, pcc_p7, plc, poc_p7));        

    }

    @Test
    public void testBuscaLlocLliure_ForesDeRang() {
        // sóc estàtic :-S

        int pcc[] = {0, 0, 0};
        int plc[] = {400, 400, 400};
        boolean poc[] = {false, false, false};
        //--------------------------------------
        // codi client erroni
        assertEquals(Parking.ERROR, AparcaloComoPuedas.buscaLlocLliure(100, 400, pcc, plc, poc));
        assertEquals(Parking.ERROR, AparcaloComoPuedas.buscaLlocLliure(-1, 400, pcc, plc, poc));
        //-----------------------------------------------
        // Longituds errònies
        assertEquals(Parking.ERROR, AparcaloComoPuedas.buscaLlocLliure(0, 100, pcc, plc, poc));
        assertEquals(Parking.ERROR, AparcaloComoPuedas.buscaLlocLliure(0, 0, pcc, plc, poc));
        assertEquals(Parking.ERROR, AparcaloComoPuedas.buscaLlocLliure(0, -400, pcc, plc, poc));
        //-----------------------------------------------
        // placesCodiClient   errònies        
        assertEquals(Parking.ERROR, AparcaloComoPuedas.buscaLlocLliure(0, 400, null, plc, poc));
        assertEquals(Parking.ERROR, AparcaloComoPuedas.buscaLlocLliure(0, 400, new int[]{}, plc, poc));
        assertEquals(Parking.ERROR, AparcaloComoPuedas.buscaLlocLliure(0, 400, new int[]{0, 0, -10}, plc, poc));
        //-----------------------------------------------
        // placesLongitudCm    errònies            
        assertEquals(Parking.ERROR, AparcaloComoPuedas.buscaLlocLliure(0, 400, pcc, null, poc));
        assertEquals(Parking.ERROR, AparcaloComoPuedas.buscaLlocLliure(0, 400, pcc, new int[]{}, poc));
        assertEquals(Parking.ERROR, AparcaloComoPuedas.buscaLlocLliure(0, 400, pcc, new int[]{300, 300, -400}, poc));
        assertEquals(Parking.ERROR, AparcaloComoPuedas.buscaLlocLliure(0, 400, pcc, new int[]{300, 300, 100}, poc));
        assertEquals(Parking.ERROR, AparcaloComoPuedas.buscaLlocLliure(0, 400, pcc, new int[]{300, 300, 0}, poc));
        //-----------------------------------------------
        // placeOcupades    errònies           
        assertEquals(Parking.ERROR, AparcaloComoPuedas.buscaLlocLliure(0, 400, pcc, plc, null));
        assertEquals(Parking.ERROR, AparcaloComoPuedas.buscaLlocLliure(0, 400, pcc, plc, new boolean[]{}));
        //-----------------------------------------------
        // Proves de consistència dels tres arrrays
        assertEquals(Parking.ERROR, AparcaloComoPuedas.buscaLlocLliure(0, 400, pcc, plc, new boolean[]{true, true}));
        assertEquals(Parking.ERROR, AparcaloComoPuedas.buscaLlocLliure(0, 400, pcc, new int[]{400, 400}, poc));
        assertEquals(Parking.ERROR, AparcaloComoPuedas.buscaLlocLliure(0, 400, new int[]{0, 0}, plc, poc));

    }

    @Test
    public void demo(){
        int monedesClient[] = {1,2,3};
        int canviEsperat[] = {1,2,3};
        
        assertArrayEquals( canviEsperat, monedesClient);
    }
    
}
