package projecte.aillament;

/**
 *
 * @author Usuari
 */
public class GestorProductesFake implements IGestorProductes {

    /*
        int codisProducte[] =   new int[]{1, 666, 7,  9 };
        int unitatsProducte[] = new int[]{3, 2,   1,  10};
        String pressupost = p.getPressupost(codisProducte, unitatsProducte);
        System.out.println("Pressupost obtingut:\n"+pressupost+".");
        
        String expected =   " * Producte 1(LLAMANTOL x 3u) - 30 €\n" +
                            " * Producte 666               - ERROR 404 - Producte no existent\n" +
                            " * Producte 7(GAMBES x 1u)    - 20 €\n" +
                            " * Producte 9(SEPIA x 10u)    - Stock insuficient\n";    
    
 
     */
    @Override
    public String getNom(int codi) {
        switch (codi) {
            case 1:
                return "LLAMANTOL";
            case 7:
                return "GAMBES";
            case 9:
                return "SEPIA";
            default:
                throw new RuntimeException("codi no existent");
        }
    }

    @Override
    public int getPreu(int codi) {
        switch (codi) {
            case 1:
                return 10;
            case 7:
                return 20;
            case 9:
                return 1;
            default:
                throw new RuntimeException("codi no existent");
        }
    }

    @Override
    public int getStock(int codi) {
        if (codi == 9) {
            return 0;
        }
        return 100000;
    }

}
