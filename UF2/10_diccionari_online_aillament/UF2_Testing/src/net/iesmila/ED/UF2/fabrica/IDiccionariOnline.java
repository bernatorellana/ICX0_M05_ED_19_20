/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.iesmila.ED.UF2.fabrica;

/**
 *
 * @author Usuari
 */
public interface IDiccionariOnline {

    String getDescripcio(String paraula);

    /**
     * donada una paraula en retorna el tipus ( nom, adjectiu, verb...)
     */
    TipusParaula getTipusParaula(String paraula);
    
}
