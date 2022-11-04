package com.example.pruebaTecnica.service;

import com.example.pruebaTecnica.entity.Usuario;
import com.example.pruebaTecnica.repository.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService implements IUsuarioService {

    @Autowired
    private IUsuarioRepository usuarioRepository;

    @Override
    public Usuario findById(int id){

        Optional <Usuario> usuario= usuarioRepository.findById((long)id);
        return usuario.get();
    }

    @Override
    public List<Usuario> findAll(){

        List<Usuario> usuarios = (List<Usuario>) usuarioRepository.findAll();

        return usuarios;

    }

    @Override
    public Usuario createUsario(Usuario usuario) {
        Usuario newUser=usuarioRepository.save(usuario);
        return newUser;
    }

    @Override
    public Usuario updateUsuario(Usuario usuario) {
        Usuario putUser =usuarioRepository.save(usuario);
        return putUser;
    }

    @Override
    public void deleteUsuario(long id) {
        usuarioRepository.deleteById(id);
    }
}
