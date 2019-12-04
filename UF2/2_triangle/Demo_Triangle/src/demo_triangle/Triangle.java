
package demo_triangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Usuari
 */
public class Triangle {

    
    
    /**
     * Aquesta funció ens diu si els costats formen triangle
     * @param a el primer costat
     * @param b el segon costat
     * @param c el tercer costat
     * @return el tipus de triangle que forma, o NO_TRIANGLE si no ho és.
     */
    public TipusTriangle getTipusTriangle(int a, int b, int c)   {
        
        //---------------------------------------------
        //      Validacions
        //---------------------------------------------
        
        if(a<=0 ||b<=0 || c<=0) {
            return TipusTriangle.NO_TRIANGLE;
        }
        ArrayList<Integer> costats = new ArrayList<Integer>();
        costats.add(a);
        costats.add(b);
        costats.add(c);
        Collections.sort(costats);
        if(costats.get(0)+costats.get(1)<=costats.get(2)) return TipusTriangle.NO_TRIANGLE;
        
        //---------------------------------------------
        
        if(a==b && b==c) return TipusTriangle.EQUILATER;
        
        if(a!=b && b!=c && a!=c) return TipusTriangle.ESCALE;  
        
        return TipusTriangle.ISOSCELES;
        
    }
    
    
}
