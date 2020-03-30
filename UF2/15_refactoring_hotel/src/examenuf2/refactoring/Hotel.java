
package examenuf2.refactoring;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.lang.Double;

/**
 *
 * @author bernat
 */
public class Hotel {
    
    private List<Estansa> mEstancesActuals = new ArrayList<Estansa>();
    

    public void addEstansa(Estansa e){
        mEstancesActuals.add(e);
    }
    
    public String getFacturacio(){
        
        
        StringBuilder sb = new StringBuilder();
        sb.append("> Facturació pendent: \n");
        for(Estansa e: mEstancesActuals) {           
           sb.append("\t-"+e.getHabitacio().getCodi()+":("+e.getHabitacio().getDescTipus()+"+"+e.getRegim().getId()+"),\t nits d'estança:"+e.getNits()+",\t preu total "+e.getPreu()+"€ \n");           
        }
        dibuixaLinia(sb);     
        EnumTipusHabitacio tipus[] = EnumTipusHabitacio.values();
        for(int i=0;i<tipus.length;i++) {
            sb.append(" Total "+tipus[i].getDescPlural()+":\t"+getTotalImports(tipus[i])+"€ \n");    
        }
        dibuixaLinia(sb);        
        sb.append(" Total:\t"+getTotalImports()+"€ \n");    
        dibuixaLinia(sb);        
        
        return sb.toString();
    }    

    private void dibuixaLinia(StringBuilder sb) {
        sb.append("=========================================================\n");
    }
    
    public double getTotalImports(){                
        return getTotalImports(null);                
    }        

    public double getTotalImports(EnumTipusHabitacio tipus){       
        double totalImports=0;                
        for(Estansa e: mEstancesActuals) {
           
            if(tipus==null || e.getHabitacio().getTipusHabitacio()==tipus) {
                totalImports+= e.getPreu();
            } 
        }
        return totalImports;
    }    
    
    
    
    
    public static int nitsDiferencia( Date a, Date b) {
        Calendar cala = Calendar.getInstance();
        cala.setTime(a);
        Calendar calb = Calendar.getInstance();
        calb.setTime(b);
         long millis1 = cala.getTimeInMillis();
        long millis2 = calb.getTimeInMillis();

        // Calculate difference in milliseconds
        long diff = millis2 - millis1;
        return  (int)Math.ceil(diff / (24 * 60 * 60 * 1000));
    }
    
}
