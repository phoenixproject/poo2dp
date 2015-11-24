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
public abstract class AbstractCafe implements Cafe {
        
    private Double preco;
        
    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
        
    @Override
    public String toString() {
        return "Preço = " + preco + "}";
    }
    
}
