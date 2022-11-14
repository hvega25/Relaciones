package Relaciones.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class CourseMaterial {
	@JsonIgnore
	@OneToOne
	private Course course;
	

	
	private String url;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;


	
	public CourseMaterial(Course course, String url) {
		super();
		this.course = course;
		this.url = url;
	}


	public CourseMaterial() {
		
	}


	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "CourseMaterial [course=" + course + ", url=" + url + ", id=" + id + "]";
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}


	
	
	
	

}
