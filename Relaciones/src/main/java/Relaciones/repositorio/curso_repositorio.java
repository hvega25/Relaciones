package Relaciones.repositorio;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import Relaciones.entidades.curso_entidades;



public interface curso_repositorio extends CrudRepository<curso_entidades, Long> {
	
	public List<curso_entidades> findAll();
}
