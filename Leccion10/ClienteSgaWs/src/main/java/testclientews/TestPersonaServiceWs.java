
package testclientews;

import clientews.servicio.Persona;
import clientews.servicio.PersonaServiceImplService;
import clientews.servicio.PersonaServiceWs;
import java.util.List;


public class TestPersonaServiceWs {
    public static void main(String[] args) {
        PersonaServiceWs personaservice = new PersonaServiceImplService().getPersonaServiceImplPort();
        
        System.out.println("Ejecutando Servicio Listar Personas WS");
        
        List<Persona> personas = personaservice.listarPersonas();
        for(Persona persona: personas){
            System.out.println("Mostrando Listado de Personas ");
            System.out.println("Persona ID = " + persona.getIdPersona() + " Persona Nombre + " + persona.getNombre() + 
                    "Persona Apellido + " + persona.getApellido() + " Persona Email + " + persona.getEmail() +
                    "Persona Telefono = " + persona.getTelefono());  
        } 
         System.out.println("Fin del Servicio Listar Personas WS");
    
    }
    
}
