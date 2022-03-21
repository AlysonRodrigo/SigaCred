package com.manutencao.Manutencao.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.manutencao.Manutencao.Model.Equipamento;
import com.manutencao.Manutencao.Repositorio.RepositorioEquipamento;

@RestController
@RequestMapping("/equipamento")
public class ControleEquipamento {
	private @Autowired RepositorioEquipamento repositorio;
	
	@GetMapping("/todos")
	public ResponseEntity<List<Equipamento>> pegarTodas() {
		List<Equipamento> objetoLista = repositorio.findAll();

		if (objetoLista.isEmpty()) {
			return ResponseEntity.status(204).build();
		} else {
			return ResponseEntity.status(200).body(objetoLista);
		}
	}

	@PostMapping("/salvar")
	public ResponseEntity<Object> salvar(@Valid @RequestBody Equipamento novoEquipamento) {

		return ResponseEntity.status(201).body(repositorio.save(novoEquipamento));
	}

	@GetMapping("/marca/{marca}")
	public ResponseEntity<List<Equipamento>> buscarPorMarca(@PathVariable(value = "marca") String marca) {
		List<Equipamento> objetoLista = repositorio.findAllByMarcaContainingIgnoreCase(marca);

		if (objetoLista.isEmpty()) {
			return ResponseEntity.status(204).build();
		} else {
			return ResponseEntity.status(200).body(objetoLista);
		}
	}

	@PutMapping("/atualizar")
	public ResponseEntity<Equipamento> AtualizarEquipamento(@Valid @RequestBody Equipamento atualizarEquipamento) {
		return ResponseEntity.status(201).body(repositorio.save(atualizarEquipamento));
	}

	@DeleteMapping("/deletar/{idEquipamento}")
	public void deletarEquipamentoPorId(@PathVariable(value = "idEquipamento") Long idEquipamento) {
		repositorio.deleteById(idEquipamento);
	}
}