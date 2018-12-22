package com.leporonitech.cadastroinstituicoes.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leporonitech.cadastroinstituicoes.entidades.Aluno;

public interface RepositorioAluno extends JpaRepository<Aluno, Long> {

}
