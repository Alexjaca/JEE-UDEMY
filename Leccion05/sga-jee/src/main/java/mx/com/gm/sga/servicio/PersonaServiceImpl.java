
package mx.com.gm.sga.servicio;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import mx.com.gm.sga.domain.Persona;

@Stateless
public class PersonaServiceImpl implements PersonaServiceRemote{

    @Override
    public List<Persona> ListarPersona() {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona(1, "Alex", "Cardenas", "jalexcardenasa@gmail.com", "096125020"));
        personas.add(new Persona(2, "Nelby", "Gomez", "nelbyygomez@gmail.com", "092834174"));
        return personas;
    }

    @Override
    public Persona EncontrarPersonaPorId(Persona Persona) {
        return null;
    }

    @Override
    public Persona EcontrarPersonaPorEmail(Persona Persona) {
        return null;
    }

    @Override
    public void RegistrarPersona(Persona Persona) {
    }

    @Override
    public void ModificarPersona(Persona Persona) {
    }

    @Override
    public void EliminarPersona(Persona Persona) {
    }
    
}
