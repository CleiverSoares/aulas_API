package br.org.serratec.venda.domain;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "produto")
public class Produto {
	// Esse @id identifica qual é o campo da minha tabela que é a chave primaria.
	@Id
	// GeneratedValue serve para gerar um valor pra chave primaria aleatoriamente.
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@Column(name = "nome", nullable = false, length = 40) // varchar de (40) not null
	private String nome;

	@Column(name = "valor", nullable = false)
	private Double valor;

	@Column(name = "descricao", nullable = false)
	private String descricao;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	@Column(name = "data_cadastro")
	private LocalDate dataCadastro;

	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getId() {
		return id;
	}

	public Produto(Integer id, String nome, Double valor, String descricao, LocalDate dataCadastro) {
		super();
		this.id = id;
		this.nome = nome;
		this.valor = valor;
		this.descricao = descricao;
		this.dataCadastro = dataCadastro;
	}

	public Produto() {

	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public Double getValor() {
		return valor;
	}

	public Object getDescricao() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setDescricao(Object descricao) {
		// TODO Auto-generated method stub

	}

}
