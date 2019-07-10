package com.tikal.cebsa.security;

import java.util.List;

import com.tikal.cebsa.modelo.Usuario;

public interface UsuarioDAO {
	
	public boolean crearUsuario(Usuario usuario);
	public boolean eliminarUsuario(String usuario);
	public Usuario consultarUsuario(String usuario);
	public List<Usuario> consultarUsuarios();
	public boolean actualizarUsuario(Usuario usuario);
	public boolean eliminarUsuario(Usuario usuario);
	public boolean actualizarUsuarios(String nombrePerfilviejo, String nombrePerfilNuevo);
	public Usuario consultarPorEmail(String email);
	
}