package com.manutencao.Manutencao.Servicos;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manutencao.Manutencao.Model.Equipamento;
import com.manutencao.Manutencao.Repositorio.RepositorioEquipamento;

@Service
public class EquipamentoServicos {

	private @Autowired RepositorioEquipamento repository;

	public Optional<?> AtualizarEquipamento(Equipamento atualizarEquipamento) {
		return repository.findById(atualizarEquipamento.getIdEquipamento()).map(productExists -> {
			productExists.setMarca(atualizarEquipamento.getMarca());
			productExists.setTipo(atualizarEquipamento.getTipo());
			productExists.setProblema(atualizarEquipamento.getProblema());
			productExists.setTempo(atualizarEquipamento.getTempo());
			productExists.setMensagem(atualizarEquipamento.getMensagem());
			return Optional.ofNullable(repository.save(productExists));
		}).orElseGet(() -> {
			return Optional.empty();
		});
	}
}
