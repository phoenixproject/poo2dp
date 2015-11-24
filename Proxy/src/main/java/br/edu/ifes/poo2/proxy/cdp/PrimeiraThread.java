/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.poo2.proxy.cdp;

/**
 *
 * @author 20101bsi0453
 */
public class PrimeiraThread extends Thread {

    
    
    @Override
    public void run() {
        
        try{
            System.out.println("A Thread vai dormir agora");
            sleep(2000);
            System.out.println("A Thread acordou");
        }catch(Exception e){
            e.printStackTrace();
        }
        
        System.out.println("Teste 1");
    }
    
}
