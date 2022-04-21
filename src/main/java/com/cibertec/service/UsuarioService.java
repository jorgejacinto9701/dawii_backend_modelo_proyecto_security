package com.cibertec.service;

import java.util.List;

import com.cibertec.entidad.Opcion;
import com.cibertec.entidad.Rol;
import com.cibertec.entidad.Usuario;

public interface UsuarioService {

	public abstract List<Opcion> traerEnlacesDeUsuario(int idUsuario);

	public abstract List<Rol> traerRolesDeUsuario(int idUsuario);

	public abstract Usuario buscaPorLogin(String login);
	
	public abstract List<Usuario> listarTodos();

}
