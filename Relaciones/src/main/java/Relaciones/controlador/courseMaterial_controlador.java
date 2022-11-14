package Relaciones.controlador;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import Relaciones.entidades.CourseMaterial;
import Relaciones.entidades.curso_entidades;
import Relaciones.repositorio.cursomateriales_repositorio;




@RestController
@RequestMapping("api")
public class courseMaterial_controlador {

	
	@Autowired
	cursomateriales_repositorio cmr;


	@GetMapping("cursoMaterial/{id}")
	public CourseMaterial getMaterial (@PathVariable long id) {
		
		return cmr.findById(id).get();
	}
	
	
	@GetMapping("cursoMaterial")
	public Iterable<CourseMaterial > getMaterial() {
		
		return cmr.findAll();
	}

}
