package projecte.aillament;

/**
 *
 * @author Usuari
 */
public interface IGestorProductes {

    String getNom(int codi);

    int getPreu(int codi);

    int getStock(int codi);
    
}
