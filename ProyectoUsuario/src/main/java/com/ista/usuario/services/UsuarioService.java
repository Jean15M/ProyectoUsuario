package com.ista.usuario.services;

import java.util.List;

import com.ista.usuario.entity.Usuario;

public interface UsuarioService {
	
	public List<Usuario> findAll();

	public Usuario save(Usuario usuario);

	public Usuario findbyId(Long id);

	public void delete(Long id);
}
