
package projecte.aillament;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bernat
 */
public class PressupostWizardTest {
    
    public PressupostWizardTest() {
    }

    /**
     * Test of getPressupost method, of class PressupostWizard.
     */
    @Test
    public void testGetPressupost() throws Exception {
        
        FabricaGestorProductes.getInstance().setMode(false);
        
        PressupostWizard p = new PressupostWizard();
        int codisProducte[] =   new int[]{1, 666, 7,  9 };
        int unitatsProducte[] = new int[]{3, 2,   1,  10};
        String pressupost = p.getPressupost(codisProducte, unitatsProducte);
        System.out.println("Pressupost obtingut:\n"+pressupost+".");
        
        String expected =   " * Producte 1(LLAMANTOL x 3u) - 30 €\n" +
                            " * Producte 666               - ERROR 404 - Producte no existent\n" +
                            " * Producte 7(GAMBES x 1u)    - 20 €\n" +
                            " * Producte 9(SEPIA x 10u)    - Stock insuficient\n";
        System.out.println("Pressupost esperat:\n"+expected+".");
        assertEquals(expected, pressupost);
    }
    
}
