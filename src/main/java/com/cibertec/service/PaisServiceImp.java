package com.cibertec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.entidad.Pais;
import com.cibertec.repository.PaisRepository;

@Service
public class PaisServiceImp implements PaisService {

	@Autowired
	private PaisRepository Repository;

	@Override
	public List<Pais> listaPais() {
		return Repository.findAll();

	}

}
