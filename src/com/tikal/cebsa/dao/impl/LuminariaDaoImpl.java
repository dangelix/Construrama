package com.tikal.cebsa.dao.impl;

import java.util.List;
import static com.googlecode.objectify.ObjectifyService.ofy;


import org.springframework.stereotype.Service;

import com.tikal.cebsa.dao.LuminariaDao;
import com.tikal.cebsa.modelo.Luminaria;
import com.tikal.cebsa.modelo.Perfil;



public class LuminariaDaoImpl implements LuminariaDao{

	@Override
	public void add(Luminaria l) {
		ofy().save().entity(l).now();
	}

	@Override
	public void delete(Luminaria l) {
		 System.out.println("si esta en daoimpl eliminando"+l);
	        ofy().delete().entity(l).now();
	        System.out.println("eliminando...");
		
	}

	@Override
	public void update(Luminaria l) {
		 System.out.print("lumi:"+l.getId());
		   Luminaria old = this.cargar(l.getId());
		System.out.print("old:"+old);
			if (old != null) {
				old.setSerie(l.getSerie());
				
				
			}

				ofy().save().entity(old);
		
	}

	@Override
	public Luminaria cargar(Long id) {
		return  ofy().load().type(Luminaria.class).id(id).now();
	}

	@Override
	public List<Luminaria> getAll() {
		return ofy().load().type(Luminaria.class).list();
	}

}
