/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifes.model;

import java.util.Random;

/**
 *
 * @author Henrique
 */
public class MaquinaVendeGoma implements InterfaceMaquina{
    
    Random gerador = new Random();
    int goma = gerador.nextInt(4);

    /*    public MaquinaVendeGoma() {
    this.entregaGoma();
    }*/
    
    
    public InterfaceMaquina insereMoeda(int moeda) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public InterfaceMaquina ejetaMoeda() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public InterfaceMaquina acionaAlavanca() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public InterfaceMaquina entregaGoma() {
        if (this.goma > 0){
            System.out.println("Aqui está sua Goma");
            return new MaquinaSemMoeda();
        }else if(this.goma == 0){
            System.out.println("Gomas Acabaram, \n Tente mais tarde");
            return new MaquinaSemGoma();
        }
        throw new UnsupportedOperationException("Not supported yet - Gomas acabaram");
    }
    
}
