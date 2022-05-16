package com.letscode.cliente.repository;

import com.letscode.cliente.dto.ClienteDTO;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends ReactiveMongoRepository<ClienteDTO, String> {

}
