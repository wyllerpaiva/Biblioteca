package br.senac.rj.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.senac.rj.dominio.Livro;

@Repository
public interface LivroRepositorio extends JpaRepository<Livro, Integer>{

}
