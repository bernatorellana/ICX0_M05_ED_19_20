package injeccio_dependecies;

/**
 *
 * @author Usuari
 */
public class Client {
    
    private int id;
    private String nom;
    private String email;

    public Client(int id, String nom, String email) {
        this.id = id;
        this.nom = nom;
        this.email = email;
    }
    
    public void assignarDescompte(double descompte, IMissatger m) {
        
        if(descompte<0) throw new RuntimeException("descompte negatiu no permés");
        // el que s'hagi de fer quan assignem descompte al client.....
                
        //Missatger m = new Missatger();
        m.enviarEmail(this.email);
        
    }
    
    
}
