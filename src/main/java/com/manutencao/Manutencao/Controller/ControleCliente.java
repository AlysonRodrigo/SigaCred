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

import com.manutencao.Manutencao.Model.Cliente;
import com.manutencao.Manutencao.Repositorio.RepositorioUsuario;

@RestController
@RequestMapping("/cliente")
public class ControleCliente {
	private @Autowired RepositorioUsuario repositorio;
	
	@GetMapping("/todos")
	public ResponseEntity<List<Cliente>> pegarTodes() {
		List<Cliente> objetoLista = repositorio.findAll();

		if (objetoLista.isEmpty()) {
			return ResponseEntity.status(204).build();
		} else {
			return ResponseEntity.status(200).body(objetoLista);
		}

	}

	@PostMapping("/salvar")
	public ResponseEntity<Cliente> salvar(@Valid @RequestBody Cliente novoCliente) {
		return ResponseEntity.status(201).body(repositorio.save(novoCliente));
	}
	
	@GetMapping("/nome/{nome}")
	public ResponseEntity<List<Cliente>> buscarPorNomeI(@PathVariable(value = "nome") String nome) {
		List<Cliente> objetoLista = repositorio.findAllByNomeContainingIgnoreCase(nome);

		if (objetoLista.isEmpty()) {
			return ResponseEntity.status(204).build();
		} else {
			return ResponseEntity.status(200).body(objetoLista);
		}
	}

	@GetMapping("/pesquisa")
	public ResponseEntity<List<Cliente>> buscarPorNomeII(@RequestParam(defaultValue = "") String nome) {
		List<Cliente> objetoLista = repositorio.findAllByNomeContainingIgnoreCase(nome);

		if (objetoLista.isEmpty()) {
			return ResponseEntity.status(204).build();
		} else {
			return ResponseEntity.status(200).body(objetoLista);
		}
	}

	@PutMapping("/atualizar")
	public ResponseEntity<Cliente> atualizar(@Valid @RequestBody Cliente usuarioParaAtualizar) {
		return ResponseEntity.status(201).body(repositorio.save(usuarioParaAtualizar));
	}

	@DeleteMapping("/deletar/{idCliente}")
	public void deletarClientePorId(@PathVariable(value = "idCliente") Long idCliente) {
		repositorio.deleteById(idCliente);
	}
}