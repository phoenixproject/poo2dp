/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.poo2.cafeteriablackwhitedecorator.cdp;

/**
 *
 * @author 20101bsi0453
 */
public class ChocolateGranulado extends AbstractComplemento {

    public ChocolateGranulado(Cafe cafe) {
        super(cafe);
    }
    
    @Override
    public Double getPreco(){
        return cafeDecorado.getPreco() + 0.50;
    }
    
}
