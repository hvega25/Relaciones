package Relaciones.repositorio;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import Relaciones.entidades.Course;



public interface curso_repositorio extends CrudRepository<Course, Long> {
	
	public List<Course> findAll();
}
