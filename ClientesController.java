package com.GerDeClientes.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.GerDeClientes.Service.ClientesService;

@RestController
@RequestMapping("/clientes")
public class ClientesController {

	private final ClientesController clientesController;

	@Autowired
	public ClientesController(ClientesService clientesService) {
		this.clientesService = clientesService;
	}

	@GetAllMapping
	public List<Clientes> buscarTodosClientes() {
		return clientesRepository.save(buscarTodosClientes);
	}

	@GetMapping ("/{id")
	public List<Clientes> buscarClientesId (@PathVariable Long id ){
		Cliente cliente = clienteService.buscarClienteId(id);
	if( clientes != null) {
		return clienteRepository.save(buscar);
		else {
			return clientesRepository.notFound(buscar);
		}
	}

	@PostMapping 
	public Criar<Clientes> criarClientes (@PathVariable Long id ){
		Cliente cliente = clienteService.cariarClienteId;
	if (cliente //---) {
		return clienteRepository.save(criar);
		else {
			return clientesRepository.notFound(criar);
		}
	}

	@PutMapping
	public Clientes alterarClientes (Long id, Clientes //----){
		Optional <Clientes> existeClientes = clientesService.alterarClientes;
	if (existeCliente.isPresent()) {	
		return clienteRepository.save(buscarClientes);
	}	
		else {
			return clientesRepository.notFound(buscarClientes);
		}
	}
	//Delete
}
