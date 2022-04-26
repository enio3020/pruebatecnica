package com.pruebaTecnica.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pruebaTecnica.demo.jpa.Empleado;
import com.pruebaTecnica.demo.service.EmpleadoServiceImpl;



@RestController
@RequestMapping("/empleado")
public class EmpleadoController {

	@Autowired
	EmpleadoServiceImpl emplService;
	
	@GetMapping("/home")
	public String index(Model model) {
		return "home";
	}

	@GetMapping(value = "/get/{nombre}")
	public List<Empleado> getEmpleado(@PathVariable String nombre) throws Exception {
		return emplService.getEmpleado(nombre);
	}
	
	@GetMapping(value = "/getTest/{nombre}")
	public String getPrueba(@PathVariable String nombre) {
		return "Hola mundo "+nombre;
	}
	
	@PostMapping(value = "/insert")
	public Empleado saveEmpledo(@RequestBody Empleado var) throws Exception {
		return emplService.saveEmpleado(var);
	}
}
