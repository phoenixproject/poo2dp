/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.poo2.pizzariatocomfome.exception;

/**
 *
 * @author pchan
 */
public class PreaparaParaVendaExecption extends Exception {
        
    public PreaparaParaVendaExecption(String message) {  
        super(message + " não existe");  
    }
}
