package br.com.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "carro")
@NamedQueries ({ @NamedQuery(name = "Carro.listar", query = " SELECT carro FROM Carro"),
@NamedQuery (name = "Carro.buscar", query = "SELECT carro FROM Carro carro WHERE carro.id = :id"),
		
public class Carro {

	@Id
	@GeneratedValue
	private int id;
	@NotEmpty(message = "o campo preço e obrigatorio")

	private String marca;
	@NotNull(message = "o campo preço e obrigatorio")

	private int numero;
	@NotEmpty(message = "campo obrigatório")
		
		
	public Carro(){
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

}
