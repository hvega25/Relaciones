package Relaciones.repositorio;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import Relaciones.entidades.CourseMaterial;


public interface cursomateriales_repositorio extends CrudRepository <CourseMaterial, Long> {
	
	public List<CourseMaterial> findAll();

}

