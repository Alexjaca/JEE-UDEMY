
package mx.com.gm.sga.servicio;

import java.util.List;
import javax.ejb.Remote;
import mx.com.gm.sga.domain.Persona;

@Remote
public interface PersonaServiceRemote {
    
    public List<Persona> ListarPersona();
    
    public Persona EncontrarPersonaPorId (Persona Persona);
    
    public Persona EcontrarPersonaPorEmail (Persona Persona);
    
    public void RegistrarPersona(Persona Persona);
    
    public void ModificarPersona(Persona Persona);
    
    public void EliminarPersona(Persona Persona);
}
