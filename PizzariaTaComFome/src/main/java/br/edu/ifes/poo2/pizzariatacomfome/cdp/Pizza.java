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
public interface Pizza {
    
    public Double getPreco();
    public void setPreco(Double preco);
    public String getTipoMassa();
    public void setTipoMassa(String tipomassa);
    public String getTipoPizza();
    public void setTipoPizza(String tipopizza);
}
