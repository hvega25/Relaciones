package Relaciones.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;




@Entity
public class CourseMaterial {

	@OneToOne
	private curso_entidades course;
	
	private String url;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;


	public CourseMaterial(String url) {
		super();
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

	public curso_entidades getCourse() {
		return course;
	}

	public void setCourse(curso_entidades course) {
		this.course = course;
	}

	


	
	
	
	
	
	
	

}
