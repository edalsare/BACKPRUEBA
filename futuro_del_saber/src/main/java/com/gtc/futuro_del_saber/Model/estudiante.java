package com.gtc.futuro_del_saber.Model;


import java.util.List;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name ="estudiante")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class estudiante {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id;
	private int id_tipodocumento;
	private String numerodocumento;
	private String nombre;
	private String apellidos;
	private String fecha_nacimiento;
	private int id_grado;
	private int id_dane;
	private String direccion;
	private String email;
	private String fijo; 
	private String celular;
	
	@ManyToMany//(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(
			name = "estudiante_asignatura",
			joinColumns = {@JoinColumn(name = "id_estudiante", referencedColumnName = "id")},
			inverseJoinColumns = {@JoinColumn(name = "id_asignatura", referencedColumnName = "id")}
			)
	private List<asignatura> asig;
	

}
