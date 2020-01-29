package projecte.aillament;

/**
 * Confecciona pressupostos
 * @author bernat
 */
public class PressupostWizard {

    
    /**
     * 
     * @param codisProducte taula que conté codis de producte dels que es destija obtenir pressupost.
     * @param unitatsProducte taula que conté les unitats demanades dels productes de la taula anterior.
     * @return una cadena amb el text del pressupost.
     * @throws Exception 
     */
    public String getPressupost( int codisProducte[] , int unitatsProducte[]) throws Exception{
        String pressupost="";
        //GestorProductes gm = new GestorProductes();
        IGestorProductes gm = FabricaGestorProductes.getInstance().fabrica();
        for(int i=0;i<codisProducte.length;i++) {
            
            int codi = codisProducte[i];
            int unitatsDemanades = unitatsProducte[i];
            try{
                String nom = gm.getNom(codi);
                int preu = gm.getPreu(codi);
                int unitatsStock = gm.getStock(codi);

                pressupost +=padRight(" * Producte "+ codi +"("+nom+" x "+unitatsDemanades+"u)", 30)+"- ";
                if(unitatsStock<unitatsDemanades) {
                    pressupost +="Stock insuficient";
                } else {
                    pressupost += preu*unitatsDemanades+" €";
                }
            } catch(Exception e) {
                pressupost +=padRight(" * Producte "+ codi , 30)+"- ERROR 404 - Producte no existent";
            }
            pressupost +="\n";
        }
        return pressupost;
    }
    
    public static String padRight(String s, int n) {
         return String.format("%1$-" + n + "s", s);  
    }    
}
