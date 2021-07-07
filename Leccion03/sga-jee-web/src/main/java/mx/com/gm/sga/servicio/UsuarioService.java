
package mx.com.gm.sga.servicio;

import java.util.List;
import javax.ejb.Local;
import mx.com.gm.sga.domain.Usuario;

@Local
public interface UsuarioService {
    
    public List<Usuario> ListasUsuario();
    
    public Usuario EncontrarUsuarioPorId(Usuario usuario);
    
    public Usuario EncontrarUsuarioPorUsername(Usuario usuario);
    
    public void RegistrarUsuario(Usuario usuario);
    
    public void ModificarUsuario(Usuario usuario);
    
    public void EliminarUsuario(Usuario usuario);
    
    
}
