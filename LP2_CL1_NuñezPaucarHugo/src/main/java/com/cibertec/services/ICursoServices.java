package com.cibertec.services;

import java.util.List;
import java.util.Optional;

import com.cibertec.model.Curso;

public interface ICursoServices {
		public List<Curso> GetAllCurso();
	    public Curso SaveCurso(Curso entity);
	    public Optional<Curso> FindCursoById(int id);
	    public void DeleteCursoById(int id);
	    public void UpdateCurso(int id,Curso entity);
}
