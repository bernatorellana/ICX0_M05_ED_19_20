/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenuf2.refactoring;

/**
 *
 * @author bernat
 */
public enum RegimEnum {
    NOMES_ALLOTJAMENT("SA"),
    ESMORCAR("AD"),
    MITJA_PENSIO("MP"),
    PENSIO_COMPLETA("PC");
    
    String id;
    RegimEnum(String id){
        this.id = id;
    }
    public String getId(){
        return id;
    }
}
