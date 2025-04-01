package com.GerDeClientes.Respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.GerDeClientes.Enity.Clientes;

public interface ClientesRepository extends JpaRepository<Clientes, Long> { //herdando o repositorio da Jpa e conectando com a tebela Clientes e com o tipo valor único do id

}
