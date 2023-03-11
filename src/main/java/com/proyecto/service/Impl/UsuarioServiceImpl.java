package com.proyecto.service.Impl;

import com.proyecto.dao.UsuarioDao;
import com.proyecto.domain.Rol;
import com.proyecto.domain.Usuario;
import com.proyecto.dto.UsuarioRegistroDTO;
import com.proyecto.service.UsuarioService;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;

import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    private UsuarioDao usuarioDao;

    @Autowired

    public UsuarioServiceImpl(UsuarioDao usuarioDao) {
        super();
        this.usuarioDao = usuarioDao;
    }

    @Override
    public Usuario guardar(UsuarioRegistroDTO registroDTO) {
        Usuario usuario = new Usuario(registroDTO.getNombre(),
                registroDTO.getApellido(), registroDTO.getEmail(),
                registroDTO.getPassword(), Arrays.asList(new Rol("ROLE_USER")));
        return usuarioDao.save(usuario);
    }

//    @Override
//    public Usuario loadUserByUsername(String username) throws UsernameNotFoundException {
//        Usuario usuario = usuarioDao.findByEmail(username);
//        if (usuario == null) {
//            throw new UsernameNotFoundException("Usuario o password inválidos");
//        }
//        return new User(usuario.getEmail(), usuario.getPassword(), mapearAutoridadesRoles(usuario.getRoles()));
//    }

    @Override
    public List<Usuario> listarUsuarios() {
        return usuarioDao.findAll();
    }

}
