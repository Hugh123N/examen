package com.cibertec.reposirtory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.model.Curso;
@Repository
public interface ICursoRepository extends JpaRepository<Curso, Integer>{

}
