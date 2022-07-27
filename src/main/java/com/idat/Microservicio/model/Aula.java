package com.idat.Microservicio.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import javax.persistence.ForeignKey;

@Entity
@Table(name = "aula")
public class Aula {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idAula;
	private String aula;
	
	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(
			name = "detalle_aula",
			joinColumns = @JoinColumn(
					name = "id_alumno", nullable = false, unique = true, foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key(id_alumno) references alumnos(id_alumno)")),
					inverseJoinColumns = @JoinColumn(
							name = "id_aula", nullable = false, unique = true, foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key(id_aula) references aula(id_aula)"))
			)
	private List<Alumno> alumno = new ArrayList<>();
	
	

	public int getIdAula() {
		return idAula;
	}

	public void setIdAula(int idAula) {
		this.idAula = idAula;
	}

	public String getAula() {
		return aula;
	}

	public void setAula(String aula) {
		this.aula = aula;
	}
	
	
	
}
