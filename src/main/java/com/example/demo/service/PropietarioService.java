package com.example.demo.service;

import com.example.demo.repository.modelo.Propietario;

public interface PropietarioService {
	
	public void ingresar(Propietario propietario);
	public Propietario buscar(String identificacion);
	public void borrar(String identificacion);
	public void actualizar(Propietario propietario);
	
	

}
