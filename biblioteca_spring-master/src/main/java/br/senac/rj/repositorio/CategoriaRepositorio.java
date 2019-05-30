package br.senac.rj.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.senac.rj.dominio.Categoria;

@Repository
public interface CategoriaRepositorio extends JpaRepository<Categoria, Integer>{

}
