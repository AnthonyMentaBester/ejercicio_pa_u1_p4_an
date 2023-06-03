package com.example.demo.service;

import com.example.demo.repository.modelo.Vehiculo;

public interface VehiculoService {
	
	public void ingresar(Vehiculo vehiculo);
	public Vehiculo buscar(String placa);
	public void borrar(String placa);
	public void actualizar(Vehiculo vehiculplaca);
	

}
