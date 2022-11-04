package com.example.pruebaTecnica.repository;

import com.example.pruebaTecnica.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface IUsuarioRepository extends CrudRepository<Usuario,Long> {
}
