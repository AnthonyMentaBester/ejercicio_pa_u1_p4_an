package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Propietario;

@Repository
public class PropietarioRepositoryImpl implements PropietarioRepository{
	
	public List<Propietario> bd = new ArrayList<>();
	

	@Override
	public void insertar(Propietario propietario) {
		this.bd.add(propietario);
		
	}

	@Override
	public Propietario seleccionar(String identificacion) {
		Propietario propietarioEncontrado = new Propietario();
		for(Propietario prop: bd) {
			if(identificacion.equals(prop.getIdentificacion())) {
				propietarioEncontrado = prop;
			}
		}
		return propietarioEncontrado;
	}

	@Override
	public void eliminar(String identificacion) {
		Propietario propietario = this.seleccionar(identificacion);
		this.bd.remove(propietario);
	}

	@Override
	public void actualizar(Propietario propietario) {
		this.eliminar(propietario.getIdentificacion());
		this.insertar(propietario);
	
	}

}
