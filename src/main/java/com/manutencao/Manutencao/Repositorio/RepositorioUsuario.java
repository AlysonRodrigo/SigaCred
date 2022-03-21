package com.manutencao.Manutencao.Repositorio;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manutencao.Manutencao.Model.Cliente;

@Repository
public interface RepositorioUsuario extends JpaRepository< Cliente, Long> {
	List<Cliente> findAllByNomeContainingIgnoreCase(String nome);
	Optional<Cliente> findByEmail(String email);
}
