package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.PropietarioRepository;
import com.example.demo.repository.modelo.Propietario;


@Service
public class PropietarioServiceImpl  implements PropietarioService{
	
	@Autowired
	private PropietarioRepository propietarioRepository;

	@Override
	public void ingresar(Propietario propietario) {
		this.propietarioRepository.insertar(propietario);
		
	}

	@Override
	public Propietario buscar(String identificacion) {
		// TODO Auto-generated method stub
		return this.propietarioRepository.seleccionar(identificacion);
	}

	@Override
	public void borrar(String identificacion) {
		
		this.propietarioRepository.eliminar(identificacion);
		
	}

	@Override
	public void actualizar(Propietario propietario) {
		
		this.propietarioRepository.actualizar(propietario);
		
	}

}
