package Relaciones.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Course {

	/*@OneToOne
	private CourseMaterial course;*/
	
	@OneToOne(mappedBy = "course")
	private CourseMaterial courseMaterial;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String curso;

	
	public Course(CourseMaterial courseMaterial, String curso) {
		super();
		this.courseMaterial = courseMaterial;
		this.curso = curso;
	}

	public Course() { 
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCurso() {
		return curso;
	}

	public void setTitle(String curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "curso_entidades [id=" + id + ", title=" + curso + "]";
	}

	public CourseMaterial getCourseMaterial() {
		return courseMaterial;
	}

	public void setCourseMaterial(CourseMaterial courseMaterial) {
		this.courseMaterial = courseMaterial;
	}

}
