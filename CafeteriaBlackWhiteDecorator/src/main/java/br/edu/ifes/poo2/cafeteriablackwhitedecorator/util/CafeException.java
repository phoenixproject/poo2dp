/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.poo2.cafeteriablackwhitedecorator.util;

/**
 *
 * @author 20101bsi0453
 */
public class CafeException extends Exception{
 
    public CafeException(String message) {  
        super(message + " não existe");  
    }  
}
