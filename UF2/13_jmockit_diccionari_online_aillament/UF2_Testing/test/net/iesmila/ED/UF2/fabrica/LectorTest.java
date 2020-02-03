package net.iesmila.ED.UF2.fabrica;

import java.util.HashMap;
import mockit.Mock;
import mockit.MockUp;
import mockit.Mocked;
import org.junit.Test;
import static org.junit.Assert.*;

public class LectorTest {

    public LectorTest() {
    }

    /**
     * Test of extreuParaulesAmbDefinicio method, of class Lector.
     */
    @Test
    public void testInformeText() {

        //FabricaDiccionari.setMode(false);
        new MockUp<DiccionariOnline>() {

            @Mock
            public String getDescripcio(String paraula) {
                if (paraula.equals("gos")) {
                    return "mamifer cannid";
                } else if (paraula.equals("gat")) {
                    return "mamifer feli";
                } else if (paraula.equals("casa")) {
                    return "llar dolça llar";
                } else {
                    throw new RuntimeException("Paraula no suportada");
                }
            }
            @Mock
            public TipusParaula getTipusParaula(String paraula) {
                // El gos i el gat viuen a casa
                HashMap<String, TipusParaula> tipus = new HashMap();
                tipus.put("El", TipusParaula.ARTICLE);
                tipus.put("gos", TipusParaula.NOM);
                tipus.put("i", TipusParaula.CONJUNCIO);
                tipus.put("el", TipusParaula.ARTICLE);
                tipus.put("gat", TipusParaula.NOM);
                tipus.put("viuen", TipusParaula.VERB);
                tipus.put("a", TipusParaula.CONJUNCIO);
                tipus.put("casa", TipusParaula.NOM);
                return tipus.get(paraula);
            }

        };

        Lector l = new Lector();
        String informeObtingut = l.extreuParaulesAmbDefinicio("El gos i el gat viuen a casa");
        String informeEsperat = "gos: mamifer cannid,gat: mamifer feli,casa: llar dolça llar";

        System.out.println(">" + informeObtingut);
        System.out.println(">" + informeEsperat);

        assertEquals(informeEsperat, informeObtingut);

    }
}
