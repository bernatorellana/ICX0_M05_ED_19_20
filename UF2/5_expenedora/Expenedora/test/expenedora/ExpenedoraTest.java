/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expenedora;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuari
 */
public class ExpenedoraTest {
    
    public ExpenedoraTest() {
    }

    @Test
    public void testPagarMetalic() {
        //-----------------------------------
        // Això és un test 
        // Sort a l'examen !
        byte casosDeTestCanviExacte[][]  = {
            {101, 1,10,1,   0,0,0,  0,0,0   ,1,10,1},
            {101, 1,10,1,   1,1,1,  0,0,0   ,2,11,2}
            //....
        };
        
        for(int i=0;i<casosDeTestCanviExacte.length;i++) {

        byte monedesClient[] = new byte[]{
            casosDeTestCanviExacte[i][1],
            casosDeTestCanviExacte[i][2],
            casosDeTestCanviExacte[i][3],
        };
        byte monedesCaixa[]  = new byte[]{
            casosDeTestCanviExacte[i][4],
            casosDeTestCanviExacte[i][5],
            casosDeTestCanviExacte[i][6],
        };
        byte importe = casosDeTestCanviExacte[i][0];
        
        TipusCanvi tc = Expenedora.pagarMetalic(importe
                ,monedesClient , monedesCaixa);
        assertEquals(TipusCanvi.VENDA_OK_CANVI_EXACTE, tc);
        
        byte monedesClientRetorn[] = new byte[]{
            casosDeTestCanviExacte[i][7],
            casosDeTestCanviExacte[i][8],
            casosDeTestCanviExacte[i][9],
        };
        byte monedesCaixaRetorn[]  = new byte[]{
            casosDeTestCanviExacte[i][10],
            casosDeTestCanviExacte[i][11],
            casosDeTestCanviExacte[i][12],
        };        
        
        assertArrayEquals(monedesClientRetorn, monedesClient );
        assertArrayEquals(monedesCaixaRetorn, monedesCaixa );


            
        }
        
        
        
        byte monedesClient[] = new byte[]{1,10,1};
        byte monedesCaixa[] = new byte[]{0,0,0};
        TipusCanvi tc = Expenedora.pagarMetalic(101,monedesClient , monedesCaixa);
        assertEquals(TipusCanvi.VENDA_OK_CANVI_EXACTE, tc);
        assertArrayEquals(new byte[]{0,0,0}, monedesClient );
        assertArrayEquals(new byte[]{1,10,1}, monedesCaixa );
        
        
        
        
    }
    
}
