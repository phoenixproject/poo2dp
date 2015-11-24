/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.poo2.cafeteriafabricaabstrata.cdp;

/**
 *
 * @author pchan
 */
public class Ingrediente {
    
    private String quantidade;

    public Ingrediente(String quantidade){
        this.quantidade = quantidade;
        System.out.println(this);
    }
    
    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }
    
    @Override    
    public String toString()
    {
        return quantidade;
    }
    
}
