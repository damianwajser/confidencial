package com.prisma.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service()
@Qualifier("Espaniol")
public class Espaniol implements Saludador{

	@Override
	public String saludar() {
		return "hola";
	}

}
