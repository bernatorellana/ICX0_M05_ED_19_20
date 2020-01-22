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
        Client c = new Client(12, "Paco", "paco@iesmila.net");
        IMissatger m = new MissatgerFake();
        c.assignarDescompte(12,m);
    }
    
}
