/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.pizzariatocomfome.bridge;

import br.edu.ifes.poo2.pizzariatacomfome.cdp.Cebola;
import br.edu.ifes.poo2.pizzariatacomfome.cdp.MolhoDeTomate;
import br.edu.ifes.poo2.pizzariatacomfome.cdp.Pizza;
import br.edu.ifes.poo2.pizzariatacomfome.cdp.Presunto;

/**
 *
 * @author pchan
 */
public class ControleDeComplemento implements ComplementoDePizza {

    @Override
    public Pizza AdicionaMolhoDeTomate(Pizza pizza) {
        System.out.println("Adicionando Molho de Tomate");
        return new MolhoDeTomate(pizza);        
    }

    @Override
    public Pizza AdicionaCebola(Pizza pizza) {
        System.out.println("Adicionando Cebola");
        return new Cebola(pizza); 
    }

    @Override
    public Pizza AdicionaPresunto(Pizza pizza) {
        System.out.println("Adicionando Presunto");
        return new Presunto(pizza); 
    }

    @Override
    public Double getPreco() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setPreco(Double preco) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getTipoMassa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setTipoMassa(String tipomassa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getTipoPizza() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setTipoPizza(String tipopizza) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
