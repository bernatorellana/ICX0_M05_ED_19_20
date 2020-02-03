package net.iesmila.aillament;

import mockit.Mock;
import mockit.MockUp;
import mockit.Mocked;
import mockit.NonStrictExpectations;
import mockit.Verifications;
import net.iesmila.aillament.EmailManager;
import net.iesmila.aillament.Persona;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author BERNAT
 */
public class PersonaTest {

    public PersonaTest() {
    }

    @Test
    public void testGetNom() {
    }

    @Test
    public void testGetCognom() {
    }

    @Test
    public void testGetNIF() {
    }

    @Mocked EmailManager em;
    @Test
    public void testEnviarEmail() {

        // Bloc de Expectations (precarreguem les respostes)
        new NonStrictExpectations(){{
            
            em.verifyEmail("EMAIL@NO_EXISTENT.COM"); returns(false);
            em.verifyEmail(anyString); returns(true);
            em.sendEmail(anyString, "ERROR", anyString); returns (false);
            em.sendEmail(anyString, anyString, anyString); returns (true);
            
            //em.verifyEmail(anyString); returns(true, true, false);
            //em.sendEmail(anyString, anyString, anyString); returns (true, false);
            
        }};
         
        /*new MockUp<EmailManager>() {
            @Mock
            public boolean sendEmail(String email, String subject, String body) {
                 return !subject.equals("ERROR");
            }
            @Mock
            public boolean verifyEmail(String email) {
                 return !email.equals("EMAIL@NO_EXISTENT.COM");
            }
        };*/

        //-------------------------------------------------------
        Persona p = new Persona("Paco", "Pil", "1111111H", "pordios@nolohagas.com");

        boolean resultat = p.enviarEmail("Hola!", "Això és un missatge");
        assertEquals(true, resultat);
        assertEquals(1, p.getEmailsEnviats());
        //--------------------------------------------------------------------
        resultat = p.enviarEmail("ERROR", "ARA VOLEM SIMULAR UN ERROR DE TRANSMISSIÖ");
        assertEquals(false, resultat);
        assertEquals(1, p.getEmailsEnviats());
        //--------------------------------------------------------------------
        Persona p2 = new Persona("Paco", "Pil", "1111111H", "EMAIL@NO_EXISTENT.COM");
        try {
            resultat = p2.enviarEmail("Hola!", "Això és un missatge");
            fail("els emails erronis han de petar");
        } catch (Exception ex) {
            // passar per aquí és el normal
        }
        assertEquals(0, p2.getEmailsEnviats());
        //--------------------------------------------------------------------
        new Verifications() {{ 
            em.sendEmail(anyString, anyString, anyString);times=2;
        }};
        
    }

}
