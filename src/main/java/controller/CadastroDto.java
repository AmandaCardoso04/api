package controller;

import java.util.List;
import java.util.stream.Collectors;

import model.Cadastro;

public class CadastroDto {

    private Long matricula;
	private String nome;
	private String nomeDosPais;
	private String periodo;
	private String curso;

    
    public CadastroDto(Cadastro cadastro){
        
        this.nome = cadastro.getNome();
		this.nomeDosPais = cadastro.getNomeDosPais();
		this.periodo = cadastro.getPeriodo();
		this.curso = cadastro.getCurso();
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

    public static List<CadastroDto> converter(List<Cadastro> cadastro){
        return cadastro.stream().map(CadastroDto::new).collect(Collectors.toList());
    }
}
    
