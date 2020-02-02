package com.ffx11.springboot.backend.apirest.models.services;

import java.util.List;

import com.ffx11.springboot.backend.apirest.models.entity.Cliente;

public interface IClienteService {
	
	public List<Cliente> findAll();

	public void delete(long id);

	public Cliente findById(Long id);

	public Cliente save(Cliente cliente);


}
