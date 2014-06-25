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

    public void insereMoeda(int moeda) {
        if (moeda == 1){
            acionaAlavanca(true);
        }else
            acionaAlavanca(false);
    }

    public void ejetaMoeda() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void acionaAlavanca(boolean moedaValida) {
        
    }
    
}
