package com.cibertec.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.model.Curso;
import com.cibertec.services.ICursoServices;

@RestController
public class CursoController {
	ICursoServices cursoServices;
	public CursoController(ICursoServices cursoServices) {
		this.cursoServices=cursoServices;
	}
	///////GET////////
	 @GetMapping("/cursos")
	public List<Curso> getAll() {
	   return cursoServices.GetAllCurso();
	}
	 @GetMapping("/curso/{id}")
	 public Optional<Curso> getAll(@PathVariable int id) {
		 return cursoServices.FindCursoById(id);
	 }
	//////////POST////////
	 @PostMapping("/curso")
	 public Curso saveCurso(@RequestBody Curso entity) {
		 return cursoServices.SaveCurso(entity);
	 }
	 ///////PUT//////////
	 @PutMapping("/curso/{id}")
	 public void updateCurso(@PathVariable int id, @RequestBody Curso entity) {
		 cursoServices.UpdateCurso(id,entity);
	 }
	 ///////DELETE///////////
	 @DeleteMapping("/curso/{id}")
	public void deleteCurso(@PathVariable int id) {
		cursoServices.DeleteCursoById(id);
	}
}
