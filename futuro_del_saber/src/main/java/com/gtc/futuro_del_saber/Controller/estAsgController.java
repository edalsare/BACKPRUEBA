package com.gtc.futuro_del_saber.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gtc.futuro_del_saber.Model.estudiante_asignatura;
import com.gtc.futuro_del_saber.Service.asigService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("estudiante_asignatura")
@CrossOrigin("*")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class estAsgController {
	
	asigService asigServ;
	
	@PostMapping("/create")
	public ResponseEntity<Object> peoples(@RequestBody estudiante_asignatura estAsg){
		asigServ.create(estAsg);
		return ResponseEntity.ok().body("Calificacion almacenada");
	}
	
	@GetMapping("/list")
	public ResponseEntity<List<estudiante_asignatura>> getList(){
        List<estudiante_asignatura> estAsign = asigServ.readAll();
        return ResponseEntity.status(HttpStatus.OK).body(estAsign);
    }
	
	@PutMapping("/update")
	 public ResponseEntity<estudiante_asignatura> updateEstAsg(@RequestBody estudiante_asignatura estAsig, int est, int mat) {
		 
		 List<estudiante_asignatura> res = asigServ.readAll();
		 
		 for( estudiante_asignatura estu: res) {
			 if(estu.getId_estudiante() == est && estu.getId_asignatura() ==mat) {
				 estu.setNota(estAsig.getNota());
				 asigServ.create(estu);
				 return ResponseEntity.status(HttpStatus.OK).body(estu);
			 }else {
				 return null;
			 }
			 
			 
		 }
		return null;
		 
		 
		 
	 }
	 
	

}
