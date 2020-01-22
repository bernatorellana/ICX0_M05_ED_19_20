package aillament;

/**
 *
 * @author bernat
 */
public class Botiga {

    public int compraProducte(int codiProducte, int unitats) {

        ProducteBD bd = new ProducteBD();

        int stock = bd.getStockProducte(codiProducte);
        if (stock > unitats) {
            Producte p = bd.getProducte(codiProducte);
            int preu = p.getPreu();
            if (unitats > 10) {
                preu = preu - p.getDescomptePerVolum();
            }

            return preu*unitats;
        }
        return -1;
    }
}
