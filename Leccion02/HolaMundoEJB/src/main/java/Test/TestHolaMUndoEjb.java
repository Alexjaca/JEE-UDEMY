
package Test;

import Beans.HolaMundoEjbRemote;
import javax.naming.*;


public class TestHolaMUndoEjb {
    public static void main(String []args){
        System.out.println("Lllamando a EJB desde el Cliente\n");
        try {
            Context JNDI = new InitialContext();
            HolaMundoEjbRemote Holamundo = (HolaMundoEjbRemote) JNDI.lookup("java:global/HolaMundoEJB/HolsMundoEjbImpl!Beans.HolaMundoEjbRemote");
            int Resultado = Holamundo.Sumar(3, 7);
            System.out.println("El Rsultado de la Suma del EJB es = " + Resultado);
            
        } catch (NamingException e) {
            e.printStackTrace(System.out);
        }
    
}
    
}
