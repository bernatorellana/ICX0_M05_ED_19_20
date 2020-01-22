package injeccio_dependecies;

/**
 *
 * @author Usuari
 */
public class Missatger implements IMissatger {

    public void enviarEmail(String adreca) {
        System.out.println("Estic enviant REALMENT un correu a :"+adreca);
        // Aquí vindria la implementació real d'enviar un correu electrònic.....
    }
    
}
