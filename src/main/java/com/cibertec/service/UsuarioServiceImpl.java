package com.cibertec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.entidad.Opcion;
import com.cibertec.entidad.Rol;
import com.cibertec.entidad.Usuario;
import com.cibertec.repository.UsuarioRepository;


@Service
public class UsuarioServiceImpl implements UsuarioService{

	@Autowired
	private UsuarioRepository repository;
	
	@Override
	public List<Opcion> traerEnlacesDeUsuario(int idUsuario) {
		return repository.traerEnlacesDeUsuario(idUsuario);
	}

	@Override
	public List<Rol> traerRolesDeUsuario(int idUsuario) {
		return repository.traerRolesDeUsuario(idUsuario);
	}

	@Override
	public Usuario buscaPorLogin(String login) {
		return repository.findByLogin(login);
	}

	@Override
	public List<Usuario> listarTodos() {
		return repository.findAll();
	}

}
