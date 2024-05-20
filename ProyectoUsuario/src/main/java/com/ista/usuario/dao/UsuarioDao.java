package com.ista.usuario.dao;

import org.springframework.data.repository.CrudRepository;

import com.ista.usuario.entity.Usuario;

public interface UsuarioDao extends CrudRepository<Usuario, Long> {

}
