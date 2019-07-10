package com.tikal.cebsa.dao;

import java.util.List;

import com.tikal.cebsa.modelo.Luminaria;

public interface LuminariaDao {
	
	public void add(Luminaria l);
	public void delete(Luminaria l);
	public void update(Luminaria l);
	public Luminaria cargar(Long id);
	public List<Luminaria> getAll();
	
	
	
	
}
