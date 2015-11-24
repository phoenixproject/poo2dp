/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.poo2.pizzariatacomfome.cdp;
/**
 *
 * @author pchan
 */
public abstract class AbstractPizza implements Pizza{

    protected Double preco;
    protected String tipomassa;
    protected String tipopizza;
       
    //@Override
    public Double getPreco() {
        return this.preco;
    }

    @Override
    public void setPreco(Double preco) {
        this.preco = preco;
    }
    
    @Override
    public String getTipoMassa() {
        return this.tipomassa;
    }    

    @Override
    public void setTipoMassa(String tipomassa) {
        this.tipomassa = tipomassa;
    }
    
    @Override
    public String getTipoPizza() {
        return this.tipopizza;
    }

    @Override
    public void setTipoPizza(String tipopizza) {
        this.tipopizza = tipopizza;
    }
    
    @Override
    public String toString() {
        return "Preço = " + preco + "}";
    }    

}
