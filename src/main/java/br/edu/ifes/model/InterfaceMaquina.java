/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.model;

/**
 *
 * @author 20121bsi0473
 */
public interface InterfaceMaquina {
    
    public InterfaceMaquina insereMoeda(int moeda);
    
    public InterfaceMaquina ejetaMoeda();
    
    public InterfaceMaquina acionaAlavanca();
    
    public InterfaceMaquina entregaGoma();
}
