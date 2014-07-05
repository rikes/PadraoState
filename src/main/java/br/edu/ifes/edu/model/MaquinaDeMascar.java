/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.edu.model;

/**
 *
 * @author 20121bsi0473
 */
public class MaquinaDeMascar implements InterfaceState{
    
    int nGomas = 10;    
    
    public void insereMoeda(int moeda) {
        if (moeda == 1){
            this.nGomas--;
            acionaAlavanca(this.nGomas);            
        }else
            ejetaMoeda();
    }

    public void ejetaMoeda() {
        System.out.println("Moeda Invalida!");
    }

    public void acionaAlavanca(int nGomas) {
        if(nGomas > 0){
            System.out.println("Goma de Mascar Saindo...");
        }else if (nGomas == 0){
            System.out.println("Gomas de Mascar Acabaram");
        }
    }
    
}
