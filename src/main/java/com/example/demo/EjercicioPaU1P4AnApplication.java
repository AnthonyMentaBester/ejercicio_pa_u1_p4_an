package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Propietario;
import com.example.demo.repository.modelo.Vehiculo;
import com.example.demo.service.PropietarioService;
import com.example.demo.service.VehiculoService;

@SpringBootApplication
public class EjercicioPaU1P4AnApplication implements CommandLineRunner{
	
	@Autowired
	private PropietarioService propietarioService;
	
	@Autowired
	private VehiculoService vehiculoService;

	public static void main(String[] args) {
		SpringApplication.run(EjercicioPaU1P4AnApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		List<Vehiculo> bd = new ArrayList<>();
		
		
		 System.out.println("ingreso del vehiculo 1");
		 Vehiculo vh1 = new Vehiculo();
		 vh1.setMarca("HONDA");
		 vh1.setModelo("P12222");
		 vh1.setPlaca("MX777");
		 vh1.setPrecio(new BigDecimal(1000));
		 vh1.setTipo("Manual");
		 
		 this.vehiculoService.ingresar(vh1);
		 System.out.println(vh1);
		 
		 vh1.setMarca("CHEVROLET");
		 vh1.setModelo("AR7777");
		 
		 System.out.println(vh1);
		 
		 Propietario pr1 = new Propietario();
		 pr1.setNombre("Anthony");
		 pr1.setApellido("Narvaez");
		 pr1.setIdentificacion("1719954370");
		 pr1.setFechaNacimiento(LocalDate.now());
		 
		 System.out.println(pr1);
		
		 
		 
		 
		
		
		
		
		
	}

}
