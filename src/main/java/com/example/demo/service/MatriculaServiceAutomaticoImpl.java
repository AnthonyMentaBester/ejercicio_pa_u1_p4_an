package com.example.demo.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

@Service("Automatico")
public class MatriculaServiceAutomaticoImpl implements MatriculaService{

	@Override
	public BigDecimal matricularse(BigDecimal precio) {
		// TODO Auto-generated method stub
		BigDecimal newPrecio = precio.multiply(new BigDecimal(0.1));
		return precio.add(newPrecio);
		
	}

}
