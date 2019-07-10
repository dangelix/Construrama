package com.tikal.cebsa.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tikal.cebsa.dao.LuminariaDao;


@Controller
@RequestMapping (value="/luminaria")
public class LuminariaController {
	


//	@Autowired 
//	LuminariaDao luminariaDao;
	
	 @RequestMapping(value={"/prueba"},method = RequestMethod.GET)
	   
	   public void prueba(HttpServletResponse response, HttpServletRequest request) throws IOException {
		   response.getWriter().println("Prueba del mètodo Sucursal prueba");

	    }
	 
	
}
