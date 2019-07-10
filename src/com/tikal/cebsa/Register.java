package com.tikal.cebsa;

import com.googlecode.objectify.ObjectifyService;
import com.tikal.cebsa.modelo.Cliente;
import com.tikal.cebsa.modelo.Luminaria;
import com.tikal.cebsa.modelo.Perfil;
import com.tikal.cebsa.security.Rol;
import com.tikal.cebsa.modelo.Usuario;


public class Register {
	public Register(){
		ObjectifyService.register(Usuario.class);
		ObjectifyService.register(Cliente.class);
		 ObjectifyService.register(Usuario.class);
		//ObjectifyService.register(SessionEntity.class);
		ObjectifyService.register(Perfil.class);
		ObjectifyService.register(Rol.class);
	
		ObjectifyService.register(Luminaria.class);
	}
}
