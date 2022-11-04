package com.example.pruebaTecnica.service;

import com.example.pruebaTecnica.entity.Usuario;

import java.util.List;

public interface IUsuarioService {
    public Usuario findById(int id);
    public List<Usuario> findAll();

    public Usuario createUsario(Usuario usuario);
    public Usuario updateUsuario (Usuario usuario);
    public void deleteUsuario(long id);
}
