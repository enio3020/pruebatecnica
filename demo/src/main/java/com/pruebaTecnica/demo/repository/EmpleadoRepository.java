package com.pruebaTecnica.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.pruebaTecnica.demo.jpa.Empleado;



public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {
	
	@Query(value = "SELECT\r\n "
			+ "    * FROM EMPLEADO e WHERE e.nombre = :var ", nativeQuery = true)
	public List<Empleado> findByNombre(@Param("var") String var);
	
}
