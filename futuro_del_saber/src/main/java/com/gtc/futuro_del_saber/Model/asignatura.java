package com.gtc.futuro_del_saber.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name ="asignatura")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class asignatura {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id;
	private String descripcion;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_docente")
	private docente doc;

}
