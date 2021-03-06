package com.leporonitech.cadastroinstituicoes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.leporonitech.cadastroinstituicoes.repositorios.RepositorioAluno;

@Controller
@RequestMapping("/alunos")
public class AlunosController {
	
	@Autowired
	private RepositorioAluno repositorioAluno;
	
	public ModelAndView index() {
		ModelAndView resultado = new ModelAndView("aluno/index");
		resultado.addObject("alunos", repositorioAluno.findAll());
		return resultado;
	}
	
}
