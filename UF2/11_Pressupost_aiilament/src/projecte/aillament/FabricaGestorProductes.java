package projecte.aillament;

/**
 * ESTIC FENT LA FABRICA DE GESTORPRODUCTES 
 * @author Usuari
 */
public class FabricaGestorProductes {
    
    private static FabricaGestorProductes singleton;
    private FabricaGestorProductes(){}
    
    public static FabricaGestorProductes getInstance(){
        if(singleton==null){
            singleton = new FabricaGestorProductes();
        }
        return singleton;
    }
    
    private boolean modeReal=true;
    
    public void setMode(boolean nouMode){
        modeReal = nouMode;
    }
    
    public IGestorProductes fabrica() {
        if(modeReal) {
            return new GestorProductes();
        } else {
            return new GestorProductesFake();
        }
    }
    
    
}
