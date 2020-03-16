
package refactoring;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bernat
 */
public enum TipusTarifa {
        REGULAR(TarifaMovieRegular.class) ,        
        NEW_RELEASE(TarifaMovieNewRelease.class) ,
        CHILDRENS(TarifaMovieChildren.class) ;
        
        private Class classeTarifa;
        TipusTarifa(Class pClasseTarifa){
            classeTarifa = pClasseTarifa;
            if( pClasseTarifa.getSuperclass()!= TarifaMovie.class) {
                String s = "Error tipus de tarifa incorrecte";
                Logger.getLogger(TipusTarifa.class.getName()).log(Level.SEVERE, s);
                throw new RuntimeException(s);
            }
        }
        public TarifaMovie getTarificador()  {
            try {
                return (TarifaMovie)classeTarifa.newInstance();
            } catch (InstantiationException ex) {
                Logger.getLogger(TipusTarifa.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(TipusTarifa.class.getName()).log(Level.SEVERE, null, ex);
            }
            return null;                    
        }
}
