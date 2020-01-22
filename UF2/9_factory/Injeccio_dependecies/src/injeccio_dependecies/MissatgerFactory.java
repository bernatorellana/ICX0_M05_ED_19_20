package injeccio_dependecies;

/**
 *
 * @author Usuari
 */
public class MissatgerFactory {
    
    
    private MissatgerFactory(){
        
    }
    
    private static MissatgerFactory singleton;
    public static MissatgerFactory getInstance(){ // getGlobal() / 
        if(singleton==null) {
            singleton = new MissatgerFactory();
        }
        return singleton;
    }
    
    
    boolean modeReal = true;
    
    
    public void setMode(boolean newMode ){
        this.modeReal = newMode;
    }
    
    public IMissatger fabrica() {
        if(modeReal) return new Missatger();
        else  return new MissatgerFake();
    }
    
}
