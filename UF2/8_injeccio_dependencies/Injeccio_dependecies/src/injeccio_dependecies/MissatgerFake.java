package injeccio_dependecies;

/**
 *
 * @author Usuari
 */
public class MissatgerFake implements IMissatger{

    @Override
    public void enviarEmail(String adreca) {
        System.out.println("Sóc UN FALSIFICADOR DE CORREUS !!!!");
    }
    
}
