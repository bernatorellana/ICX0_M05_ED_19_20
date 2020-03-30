package examenuf2.refactoring;

/**
 *
 * @author bernat
 */
public enum EnumTipusHabitacio {
    DOBLE("dobles"),
    TRIPLE("triples"),
    SUITE("suites") ;
    
    String descPlural;
    EnumTipusHabitacio(String descPlural){
        this.descPlural = descPlural;
    }
    public String getDescPlural(){
        return descPlural;
    }    
}
