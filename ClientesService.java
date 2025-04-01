package com.GerDeClientes.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GerDeClientes.Respository.ClientesRepository;

@Service
public class ClientesService {

	private final ClientesRepository clientesRepository;

	@Autowired
	public ClientesService(ClientesRepository clientesRepository) {
		this.clientesRepository = clientesRepository;
	}
	// Aqui se cria os métodos:

	// Primeiro vem o GetAll -- consulta todos os clientes
	public Clientes buscaTodosClientes(ClientesRepository buscaTodosClientes) {

	}

	// Depois o GetId -- consulta um cliente, de acordo com o seu id
	public Clientes buscaClientes(ClientesRepository buscaClientes) {

	}

	// Depois o post -- cria um novo cliente
	public Clientes criarClientes(ClientesRepository criarClientes) {

	}

	// Depois o put -- altera um cliente que já existe
	public Clientes alterarClientes(ClientesRepository alterarClientes) {

	}

	// Por fim o delete --deleta os clientes
	public Clientes deletarClientes(ClientesRepository deletarClientes) {

	}
}
