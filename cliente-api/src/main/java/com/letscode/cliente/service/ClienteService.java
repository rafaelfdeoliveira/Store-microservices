package com.letscode.cliente.service;

import com.letscode.cliente.dto.ClienteDTO;
import com.letscode.cliente.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Arrays;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ClienteService {

    private final ClienteRepository clienteRepository;

    public void salvar() {

        ClienteDTO cliente = ClienteDTO
                .builder()
                .id(UUID.randomUUID().toString())
                .nome("Maria")
                .cpf("12345")
                .idade(30)
                .dataNascimento(LocalDate.now())
                .telefones(Arrays.asList("123","4332", "31231"))
                .build();


        clienteRepository.save(cliente);
    }

    public void busca() {
        List<ClienteDTO> clientes =
                clienteRepository.findByIdade();

        clientes.forEach(x -> System.out.println(x.getNome() + " " + x.getIdade()));
    }




}
