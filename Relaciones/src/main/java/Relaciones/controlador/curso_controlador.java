package Relaciones.controlador;

import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonIgnore;

import Relaciones.entidades.curso_entidades;
import Relaciones.repositorio.curso_repositorio;



@RestController
@RequestMapping("api")

public class curso_controlador {
	
	
	
	@Autowired
	curso_repositorio cursoRep;
	
	@GetMapping("curso/{id}")
	public curso_entidades getEntidades (@PathVariable long id) {
		
		return cursoRep.findById(id).get();
	}
	
	
	@GetMapping("curso")
	public Iterable<curso_entidades> getCurso() {
		
		return cursoRep.findAll();
	}

}
