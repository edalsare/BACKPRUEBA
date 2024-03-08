package com.gtc.futuro_del_saber.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gtc.futuro_del_saber.Model.estudiante_asignatura;

@Repository
public interface asigRepository extends JpaRepository<estudiante_asignatura, Integer>{
	
	

}
