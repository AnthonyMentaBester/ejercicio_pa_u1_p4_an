package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Propietario;
import com.example.demo.repository.modelo.Vehiculo;


@Repository
public class VehiculoRepositoryImpl implements VehiculoRepository{
	
	public List<Vehiculo> bd = new ArrayList<>();

	@Override
	public void insertar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.bd.add(vehiculo);
		
	}

	@Override
	public Vehiculo seleccionar(String placa) {
		// TODO Auto-generated method stub
		Vehiculo vehiculoEncontrado = new Vehiculo();
		for(Vehiculo vehi: bd) {
			if(placa.equals(vehi.getPlaca())) {
				vehiculoEncontrado = vehi;
			}
		}
		return vehiculoEncontrado;
	}

	@Override
	public void eliminar(String placa) {
		// TODO Auto-generated method stub
		Vehiculo vehiculo = this.seleccionar(placa);
		this.bd.remove(vehiculo);
		
	}

	@Override
	public void actualizar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.eliminar(vehiculo.getPlaca());
		this.insertar(vehiculo);
		
		
	}
	

}
