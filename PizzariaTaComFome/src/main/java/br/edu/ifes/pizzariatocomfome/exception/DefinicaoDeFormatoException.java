/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.pizzariatocomfome.exception;

/**
 *
 * @author pchan
 */
public class DefinicaoDeFormatoException extends Exception {
    
    public DefinicaoDeFormatoException(String message) {  
        super(message + " não existe");  
    }
    
}
