package com.leporonitech.cadastroinstituicoes.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leporonitech.cadastroinstituicoes.entidades.Instituicao;

public interface RepositorioInstituicao extends JpaRepository<Instituicao, Long> {

	List<Instituicao> findByNomeContaining(String nome);
}
