package net.iesmila.ED.UF2.fabrica;


import java.util.StringTokenizer;


public class Lector {
    
    public String extreuParaulesAmbDefinicio ( String text ) {
        
        String informe = "";
        
        // Comentem la creaci� "a sac" del diccionari real
        //DiccionariOnline dic = new DiccionariOnline();
        // Reemplacem la crida amb la creaci� a partir del diccionari.
        // El diccionari ens retorna una classe real o fict�cia....no ho sabem
        // per� ens en fiem....
        IDiccionariOnline dic = FabricaDiccionari.getSingleton().getDiccionari();
        
        String paraula="";
        // partir la frase en paraules
        StringTokenizer tokenizer = new StringTokenizer(text, " ");
        String coma = "";
        // per cada paraula de la frase
        while(tokenizer.hasMoreTokens()){
            paraula = tokenizer.nextToken();
            // esbrinem el tipus de paraula
            TipusParaula tipus = dic.getTipusParaula(paraula);
            if( tipus==TipusParaula.ADJECTIU ||
                tipus==TipusParaula.NOM) {
                // si �s nom o adjectiu, la inclourem a l'informe.
                informe = informe + coma + paraula +": "+dic.getDescripcio(paraula);
                coma = ",";
            }
            
        }
        return informe;
    }
    
}
