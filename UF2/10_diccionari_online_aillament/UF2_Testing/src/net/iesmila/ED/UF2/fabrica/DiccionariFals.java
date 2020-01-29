package net.iesmila.ED.UF2.fabrica;

import java.util.HashMap;

/**
 * @author Usuari
 */
public class DiccionariFals implements IDiccionariOnline {
  
/*
String informeObtingut = l.extreuParaulesAmbDefinicio("El gos i el gat viuen a casa");
String informeEsperat = "
    gos: mamifer cannid,
    gat: mamifer feli,
    casa: llar dolça llar";
*/

    @Override
    public String getDescripcio(String paraula) {
        if(paraula.equals("gos")) { return "mamifer cannid"; }
        else if(paraula.equals("gat")) { return "mamifer feli"; }
        else if(paraula.equals("casa")) { return "llar dolça llar"; }
        else throw new RuntimeException("Paraula no suportada"); 
    }
    
    @Override
    public TipusParaula getTipusParaula(String paraula) {
     // El gos i el gat viuen a casa
     HashMap<String, TipusParaula> tipus = new HashMap();
     tipus.put("El",TipusParaula.ARTICLE );
     tipus.put("gos",TipusParaula.NOM );
     tipus.put("i",TipusParaula.CONJUNCIO );
     tipus.put("el",TipusParaula.ARTICLE );
     tipus.put("gat",TipusParaula.NOM );
     tipus.put("viuen",TipusParaula.VERB );
     tipus.put("a",TipusParaula.CONJUNCIO);
     tipus.put("casa",TipusParaula.NOM );
     
     return tipus.get(paraula);
    }
    
}
