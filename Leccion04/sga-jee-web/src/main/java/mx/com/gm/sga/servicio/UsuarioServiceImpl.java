
package mx.com.gm.sga.servicio;

import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import mx.com.gm.sga.datos.UsuarioDao;
import mx.com.gm.sga.domain.Usuario;

@Stateless
public class UsuarioServiceImpl implements UsuarioService{
    
    @Inject
    private UsuarioDao usuariodao;

    
    @Override
    public List<Usuario> ListasUsuario() {
        return usuariodao.findAllUsuario();    
    }

    @Override
    public Usuario EncontrarUsuarioPorId(Usuario usuario) {
        return usuariodao.findUsuarioById(usuario);
    }

    @Override
    public Usuario EncontrarUsuarioPorUsername(Usuario usuario) {
        return usuariodao.findUsuarioByUsername(usuario);
    }

    @Override
    public void RegistrarUsuario(Usuario usuario) {
        usuariodao.insertUsuario(usuario);
    }

    @Override
    public void ModificarUsuario(Usuario usuario) {
        usuariodao.updateUsuario(usuario);
    }

    @Override
    public void EliminarUsuario(Usuario usuario) {
        usuariodao.deleteUsuario(usuario);
    }
    
}
