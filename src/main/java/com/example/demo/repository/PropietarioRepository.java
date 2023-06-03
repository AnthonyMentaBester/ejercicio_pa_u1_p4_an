package com.example.demo.repository;

import com.example.demo.repository.modelo.Propietario;

public interface PropietarioRepository {
	
	public void insertar(Propietario propietario);
	public Propietario seleccionar(String identificacion);
	public void eliminar(String identificacion);
	public void actualizar(Propietario propietario);
	

}
