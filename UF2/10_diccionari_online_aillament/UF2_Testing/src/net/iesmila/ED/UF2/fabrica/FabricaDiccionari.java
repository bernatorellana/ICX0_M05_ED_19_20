package net.iesmila.ED.UF2.fabrica;

/**
 *
 * @author Usuari
 */
public class FabricaDiccionari {

    // --------------------------
    // patr� singleton
    // --------------------------
    // 1.- Constructor private
    private FabricaDiccionari(){}
    
    // 2.- crear el singleton
    // l'�nic objecte de la classe FabricaDiccionari que mai existir� en el m�n mundial
    private static FabricaDiccionari singleton; 
    
    // 3.- M�tode per accedir al singleton
    public static FabricaDiccionari getSingleton(){
        if(singleton==null) {
            singleton = new FabricaDiccionari();
        }
        return singleton;
    }
    // ------------------
    
    
    private static boolean modeReal = true;
    
    public static void setMode( boolean newMode ){
        modeReal = newMode;
    }
    
    public IDiccionariOnline getDiccionari() {
        
        if(modeReal) return new DiccionariOnline();
        else return new DiccionariFals();
    }

    
}
