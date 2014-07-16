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
public final class MaquinaRecebeMoeda implements InterfaceMaquina{
    int moeda;
    
    public MaquinaRecebeMoeda(int moeda) {
        this.moeda = moeda;
    }    
    public InterfaceMaquina insereMoeda(int moeda) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public InterfaceMaquina ejetaMoeda() {
        System.out.println("Moeda Invalida");
        return new MaquinaSemMoeda();
    }

    public InterfaceMaquina acionaAlavanca() {
        if (this.moeda == 1){
            System.out.println("Acione a Alavanca");
            return new MaquinaVendeGoma();//Goma Vendida
        }else{
           ejetaMoeda();
           return new MaquinaSemMoeda();
        }
    }

    public InterfaceMaquina entregaGoma() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
