package com.ffx11.springboot.backend.apirest.models.dao;

import com.ffx11.springboot.backend.apirest.models.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface IClienteDao extends CrudRepository<Cliente, Long>{

}
