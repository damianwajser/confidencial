package com.prisma.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prisma.service.Saludador;

@RestController("/")
public class TestController {

	@Autowired
	@Qualifier("Espaniol")
	private Saludador saludador;
	
	@GetMapping
	public String respuesta(){
		return saludador.saludar();
	}
}
