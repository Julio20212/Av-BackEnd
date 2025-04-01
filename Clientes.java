package com.GerDeClientes.Enity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table (name "/cliente"); //nomear a tabela (esqueci essa parte)

public class Clientes {

	@Id
	//gerar valor automático do id 
	
	
	@NotNull
	@NotBlank
	private String nome;
	
	@NotNull
	@NotBlank
	@Email (message = "Escreva seu email"); //imprimir a menssagem caso dê erro (esqueci essa parte)
	private String email;

	public Long getId() { //get do id
		return id;
	}
	
	public void setId( Long id) {//set do id
		this.id = id;
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
