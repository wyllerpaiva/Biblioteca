package br.senac.rj.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.senac.rj.repositorio.CategoriaRepositorio;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepositorio categoriaRepositorio;

}
