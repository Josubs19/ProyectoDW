
package com.proyecto.service;


import com.proyecto.domain.Usuario;
import com.proyecto.dto.UsuarioRegistroDTO;
import java.util.List;
//import org.springframework.security.core.userdetails.UserDetailsService;

//agregar extends UserDetailsService
public interface UsuarioService  {
    
    public Usuario guardar(UsuarioRegistroDTO registroDTO);
    public List<Usuario> listarUsuarios();
    
    
}
