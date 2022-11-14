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
	
	private String title;

	
	public Course(CourseMaterial courseMaterial, String title) {
		super();
		this.courseMaterial = courseMaterial;
		this.title = title;
	}

	public Course() { 
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "curso_entidades [id=" + id + ", title=" + title + "]";
	}

	public CourseMaterial getCourseMaterial() {
		return courseMaterial;
	}

	public void setCourseMaterial(CourseMaterial courseMaterial) {
		this.courseMaterial = courseMaterial;
	}

}
