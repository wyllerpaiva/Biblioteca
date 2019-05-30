package br.senac.rj.inicializacao;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import br.senac.rj.dominio.Categoria;
import br.senac.rj.dominio.Livro;
import br.senac.rj.repositorio.CategoriaRepositorio;
import br.senac.rj.repositorio.LivroRepositorio;


@Component
public class Init implements ApplicationListener<ContextRefreshedEvent>{
	@Autowired
	private LivroRepositorio livroRepositorio;
	
	@Autowired
	private CategoriaRepositorio categoriaRepositorio;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
	
		Livro livro = new Livro();
		livro.setNome("nome 1"); 
		livro.setDescricao("descricao 1"); 
		
		Livro livro2 = new Livro(); 
		livro2.setNome("nome 2"); 
		livro2.setDescricao("descricao 2"); 
		
		
		Categoria categoria = new Categoria();
		categoria.setNome("nome do livro");
		categoria.setDescricao("descricao do livro");
		categoria.setTipo("tipo do livro");;
		
		categoriaRepositorio.saveAll(Arrays.asList(categoria));
		livroRepositorio.saveAll(Arrays.asList(livro, livro2));
	}

}
