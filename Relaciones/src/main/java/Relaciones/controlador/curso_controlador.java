package Relaciones.controlador;

import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonIgnore;

import Relaciones.entidades.Course;
import Relaciones.repositorio.curso_repositorio;



@RestController
@RequestMapping("api")

public class curso_controlador {
	
	
	
	@Autowired
	curso_repositorio cursoRep;
	
	@GetMapping("curso/{id}")
	public Course getCursoID (@PathVariable long id) {
		
		return cursoRep.findById(id).get();
	}
	
	
	@GetMapping("curso")
	public Iterable<Course> getCurso() {
		
		return cursoRep.findAll();
	}

}
