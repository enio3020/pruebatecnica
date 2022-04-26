package com.pruebaTecnica.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pruebaTecnica.demo.jpa.Empleado;
import com.pruebaTecnica.demo.repository.EmpleadoRepository;

@Service
public class EmpleadoServiceImpl {
	
	
	@Autowired
	EmpleadoRepository emplRepository;

	public List<Empleado> getEmpleado(String var) throws Exception {
		List<Empleado> empleado = new ArrayList<Empleado>();
		empleado = emplRepository.findByNombre(var);
		if(empleado != null) {
			return empleado;
		} else {
			throw new Exception("No existe");
		}
	}
	
	public Empleado saveEmpleado(Empleado imput) throws Exception {
		Empleado var = new Empleado();
		if (imput != null) {
			var = emplRepository.save(imput);
		} else {
			throw new Exception("No existe");
		}
		return var;
	}
}
