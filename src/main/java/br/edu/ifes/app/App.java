package br.edu.ifes.app;

import br.edu.ifes.model.MaquinaSetup;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MaquinaSetup maquinaGoma = new MaquinaSetup();
        
        maquinaGoma.inserirMoeda(2);
        maquinaGoma.acionaAlavanca();
        maquinaGoma.entregaGoma();
    }
}
