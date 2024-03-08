package com.gtc.futuro_del_saber.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name ="docente")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class docente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id;
	private int id_tipodocumento;
	private String numerodocumento;
	private String nombres;
	private String apellidos;
	private String fecha_nacimiento;
	private int asig_dictadas;
	private String grado_escolaridad;
	private int id_gradoresponsable ;
	private String email;
	private String fijo; 
	private String celular;

}
