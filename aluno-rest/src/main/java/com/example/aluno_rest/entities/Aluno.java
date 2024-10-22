package com.example.aluno_rest.entities;

import java.io.Serializable;
import java.util.Objects;

public class Aluno implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String matricula;
	private String nome;
	private boolean ativo;
	
	public Aluno() {
		
	}

	public Aluno(int id, String matricula, String nome, boolean ativo) {
		super();
		this.id = id;
		this.matricula = matricula;
		this.nome = nome;
		this.ativo = ativo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	@Override
	public String toString() {
		return "Aluno [id=" + id + ", matricula=" + matricula + ", nome=" + nome + ", ativo=" + ativo + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return id == other.id;
	}
	
	
}
