/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.poo2.calculadoraimposto.util;

/**
 *
 * @author 20101bsi0453
 */
public class Faixa {
    
    private double salarioMinimo;
    private double salarioMaximo;
    private double desconto;
    private Faixa proximo;

    
    public Faixa(double salarioMinimo, double salarioMaximo, double desconto, Faixa faixa){
        this.salarioMinimo = salarioMinimo;
        this.salarioMaximo = salarioMaximo;
        this.desconto = desconto;
        this.proximo = faixa;
    }
    
    public Faixa(double salarioMinimo, double salarioMaximo, double desconto){
        this.salarioMinimo = salarioMinimo;
        this.salarioMaximo = salarioMaximo;
        this.desconto = desconto;
    }
    
    public boolean verificar(double salario){
        if((salario >= salarioMinimo) && (salario <= salarioMaximo) || (proximo != null)){
            return true;
        }
        else{
            return false;
        }
    }
    
    public double calcular(double salario){
        if(verificar(salario)){
            return desconto*salario;
        }
        else{
            return proximo.calcular(salario);
        }
    }
    
    public double getSalarioMinimo() {
        return salarioMinimo;
    }

    public void setSalarioMinimo(double salarioMinimo) {
        this.salarioMinimo = salarioMinimo;
    }

    public double getSalarioMaximo() {
        return salarioMaximo;
    }

    public void setSalarioMaximo(double salarioMaximo) {
        this.salarioMaximo = salarioMaximo;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
    
    
}
