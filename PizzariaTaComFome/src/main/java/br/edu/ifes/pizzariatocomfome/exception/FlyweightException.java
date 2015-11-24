/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.pizzariatocomfome.exception;

/**
 *
 * @author paulo.henrique
 */
public class FlyweightException extends Exception {
    
    public FlyweightException(String message) {  
        super(message + " não existe");  
    }
    
}
