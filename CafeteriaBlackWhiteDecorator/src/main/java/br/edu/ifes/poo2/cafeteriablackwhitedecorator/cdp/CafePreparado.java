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
public class CafePreparado extends AbstractCafe {
 
    private String nome;
    private Double preco;
    private Acucar acucar;
    private Agua agua;
    private Bicarbonato bicarbonato;    
    private CafeSoluvel cafeSoluvel;
    private Chocolate chocolate;
    private Leite leite;
    private Canela canela;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override
    public Double getPreco() {
        return preco;
    }

    @Override
    public void setPreco(Double preco) {
        this.preco = preco;
    }
    
    public Acucar getAcucar() {
        return acucar;
    }

    public void setAcucar(Acucar acucar) {
        this.acucar = acucar;
    }

    public Agua getAgua() {
        return agua;
    }

    public void setAgua(Agua agua) {
        this.agua = agua;
    }

    public Bicarbonato getBicarbonato() {
        return bicarbonato;
    }

    public void setBicarbonato(Bicarbonato bicarbonato) {
        this.bicarbonato = bicarbonato;
    }

    public CafeSoluvel getCafeSoluvel() {
        return cafeSoluvel;
    }

    public void setCafeSoluvel(CafeSoluvel cafeSoluvel) {
        this.cafeSoluvel = cafeSoluvel;
    }

    public Chocolate getChocolate() {
        return chocolate;
    }

    public void setChocolate(Chocolate chocolate) {
        this.chocolate = chocolate;
    }

    public Leite getLeite() {
        return leite;
    }

    public void setLeite(Leite leite) {
        this.leite = leite;
    }

    public Canela getCanela() {
        return canela;
    }

    public void setCanela(Canela canela) {
        this.canela = canela;
    }
    
    @Override
    public String toString() {
        return "**** " + getNome() + " de valor: " + getPreco() + " ****";
        
    }
    
}
