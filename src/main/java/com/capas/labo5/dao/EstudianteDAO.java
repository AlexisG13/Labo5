package com.capas.labo5.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.capas.labo5.domain.Estudiante;

public interface EstudianteDAO {
	
	public List<Estudiante> findAll() throws DataAccessException;
	
	public Estudiante findOne(Integer code) throws DataAccessException;

}
