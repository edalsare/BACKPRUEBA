package com.gtc.futuro_del_saber.Service;


import java.util.Optional;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gtc.futuro_del_saber.Model.estudiante_asignatura;
import com.gtc.futuro_del_saber.Repository.asigRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class asigService {
	
	asigRepository asigRepo;
	
	public estudiante_asignatura create (estudiante_asignatura est_asg) {
		return asigRepo.save(est_asg);
	}
	
	public Optional<estudiante_asignatura> read(int id){
		return asigRepo.findById(id);
	}
	
	public List<estudiante_asignatura> readAll(){
		return asigRepo.findAll();
	}
	
	
 
}
