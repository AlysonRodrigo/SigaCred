package com.manutencao.Manutencao.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;

//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Equipamento {

	private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) long idEquipamento;
	private @NotBlank String marca;
	private @NotBlank String tipo;
	private @NotBlank String problema;
	private @NotBlank String tempo;
	private String mensagem;
	
	public long getIdEquipamento() {
		return idEquipamento;
	}
	public void setIdEquipamento(long idEquipamento) {
		this.idEquipamento = idEquipamento;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getProblema() {
		return problema;
	}
	public void setProblema(String problema) {
		this.problema = problema;
	}
	public String getTempo() {
		return tempo;
	}
	public void setTempo(String tempo) {
		this.tempo = tempo;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
}
