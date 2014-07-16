/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifes.model;

/**
 *
 * @author Henrique
 */
public class MaquinaSetup {
    protected InterfaceMaquina stateInterface;
    
    public MaquinaSetup(){
        stateInterface = new MaquinaSemMoeda();
    }    
    public void inserirMoeda(int moeda){
        stateInterface = stateInterface.insereMoeda(moeda);
    }
    public void ejetaMoeda(){
        stateInterface = stateInterface.ejetaMoeda();
    }
    public void acionaAlavanca(){
        stateInterface = stateInterface.acionaAlavanca();
    }
    public void entregaGoma(){
        stateInterface = stateInterface.entregaGoma();
    }
    
}
