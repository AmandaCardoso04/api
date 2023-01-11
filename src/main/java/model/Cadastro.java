package model;

import javax.persistence.Entity;

@Entity
public class Cadastro {

	private Long matricula;
	private String nome;
	private String nomeDosPais;
	private String periodo;
	private String curso;

	public Cadastro(){
	}

	public Cadastro(String nome, String nomeDosPais, String periodo, String curso){
		this.nome = nome;
		this.nomeDosPais = nomeDosPais;
		this.periodo = periodo;
		this.curso = curso;
	}

	public Long getMatricula() {
		return matricula;
	}

	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeDosPais() {
		return nomeDosPais;
	}

	public void setNomeDosPais(String nomeDosPais) {
		this.nomeDosPais = nomeDosPais;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
}
