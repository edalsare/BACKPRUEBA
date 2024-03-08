package com.gtc.futuro_del_saber.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gtc.futuro_del_saber.Model.estudiante;
import com.gtc.futuro_del_saber.Model.estudiante_asignatura;
import com.gtc.futuro_del_saber.Repository.estuRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class estuService {
	
	estuRepository estuRepo;
	
	public estudiante create (estudiante estu) {
		return estuRepo.save(estu);
	}
	
	public Optional<estudiante> read(int id){
		return estuRepo.findById(id);
	}
	
	public List<estudiante> readAll(){
		return estuRepo.findAll();
	}
	
	public void delete(int id) {
		estuRepo.deleteById(id);
	}

}
