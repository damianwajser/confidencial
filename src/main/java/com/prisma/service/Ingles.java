package com.prisma.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("Ingles")
public class Ingles implements Saludador{

	@Override
	public String saludar() {
		return "hello";
	}

}
