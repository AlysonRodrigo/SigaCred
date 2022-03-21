package com.manutencao.Manutencao.Repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manutencao.Manutencao.Model.Equipamento;

@Repository
public interface RepositorioEquipamento extends JpaRepository<Equipamento, Long> {

	List<Equipamento> findAllByMarcaContainingIgnoreCase(String marca);
}