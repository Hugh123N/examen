package com.cibertec.services.impl;

import java.util.List;
import java.util.Optional;

import com.cibertec.model.Curso;
import com.cibertec.reposirtory.ICursoRepository;
import com.cibertec.services.ICursoServices;

public class CursoServices implements ICursoServices{
	
	ICursoRepository _repository;
	
	public CursoServices(ICursoRepository repository) {
		_repository=repository;
	}
	@Override
	public List<Curso> GetAllCurso() {
		// TODO Auto-generated method stub
		return _repository.findAll();
	}

	@Override
	public Curso SaveCurso(Curso entity) {
		// TODO Auto-generated method stub
		return _repository.save(entity);
	}

	@Override
	public Optional<Curso> FindCursoById(int id) {
		// TODO Auto-generated method stub
		return _repository.findById(id);
	}

	@Override
	public void DeleteCursoById(int id) {
		// TODO Auto-generated method stub
		_repository.deleteById(id);
	}

	@Override
	public void UpdateCurso(int id,Curso entity) {
		// TODO Auto-generated method stub
		_repository.save(entity);
	}

}
