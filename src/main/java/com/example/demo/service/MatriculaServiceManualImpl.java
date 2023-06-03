package com.example.demo.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

@Service("manual")
public class MatriculaServiceManualImpl implements MatriculaService{

	@Override
	public BigDecimal matricularse(BigDecimal precio) {
		BigDecimal newPrecio = precio.multiply(new BigDecimal(0.15));
		return precio.add(newPrecio);
		
	}



}
