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
@Table(name ="estudiante_asignatura")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class estudiante_asignatura {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id;
	private double nota;
	private int periodo;
	private int id_estudiante;
	private int id_asignatura;

}
