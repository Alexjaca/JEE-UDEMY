
package Beans;

import javax.ejb.Stateless;

@Stateless
public class HolsMundoEjbImpl implements HolaMundoEjbRemote{

    @Override
    public int Sumar(int a, int b) {
        System.err.println("Ejecunatdo el Metodo Suma con EJB");
        int Suma = a+b;
        
        return Suma;
        
    }
    
}
