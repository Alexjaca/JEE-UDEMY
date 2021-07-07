
package mx.com.gm.sga.servicio;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import mx.com.gm.sga.datos.PersonaDao;
import mx.com.gm.sga.domain.Persona;



@Stateless
public class PersonaServiceImpl implements PersonaServiceRemote, PersonaService{

    @Inject
    private PersonaDao personaDao;
    
    @Override
    public List<Persona> ListarPersona() {
        return personaDao.findAllPersona();
    }

    @Override
    public Persona EncontrarPersonaPorId(Persona Persona) {
        return personaDao.findPersonaById(Persona);
    }

    @Override
    public Persona EcontrarPersonaPorEmail(Persona Persona) {
        return personaDao.findPersonaByEmail(Persona);
    }

    @Override
    public void RegistrarPersona(Persona Persona) {
        personaDao.insertPersona(Persona);
        
    }

    @Override
    public void ModificarPersona(Persona Persona) {
        personaDao.updatePersona(Persona);
    }

    @Override
    public void EliminarPersona(Persona Persona) {
        personaDao.deletePersona(Persona);
    }
    
}
