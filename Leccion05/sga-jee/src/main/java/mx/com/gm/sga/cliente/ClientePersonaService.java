
package mx.com.gm.sga.cliente;

import java.util.List;
import javax.naming.*;
import mx.com.gm.sga.domain.Persona;
import mx.com.gm.sga.servicio.PersonaServiceRemote;

public class ClientePersonaService {
    public static void main (String[] args) throws NamingException{
        System.out.println("Inciando llamada al EJb desde el cliente");
        try {
             Context JNDI = new InitialContext();
             PersonaServiceRemote personaservice = (PersonaServiceRemote) JNDI.lookup("java:global/sga-jee/PersonaServiceImpl!mx.com.gm.sga.servicio.PersonaServiceRemote");
             
             List<Persona> personas = personaservice.ListarPersona();
             
             for(Persona persona: personas){
                 System.out.println(persona);   
             }
             System.out.println("\n Fin de la llamada al EJB desde el cliente");

        } catch (NamingException e) {
            e.printStackTrace(System.out);
        }
    }
    
}
