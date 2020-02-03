package net.iesmila.ED.UF2.fabrica;

/**
 *
 * @author Usuari
 */
public class FabricaDiccionari {

    // --------------------------
    // patró singleton
    // --------------------------
    // 1.- Constructor private
    private FabricaDiccionari(){}
    
    // 2.- crear el singleton
    // l'únic objecte de la classe FabricaDiccionari que mai existirà en el món mundial
    private static FabricaDiccionari singleton; 
    
    // 3.- Mètode per accedir al singleton
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
