/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.model;

/**
 *
 * @author 20121bsi0473
 */
public class MaquinaSemMoeda implements InterfaceMaquina{

    public InterfaceMaquina insereMoeda(int moeda) {
        System.out.println("Maquina sem moeda... Insira a moeda");
        return new MaquinaRecebeMoeda(moeda);
    }

    public InterfaceMaquina ejetaMoeda() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public InterfaceMaquina acionaAlavanca() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public InterfaceMaquina entregaGoma() {
        System.out.println("Erro de Busca");
        return this;
    }
    
    
}
