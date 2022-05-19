package com.letscode.cliente.controller;

import ch.qos.logback.core.net.server.Client;
import com.letscode.cliente.dto.ClienteDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    private static Map<String, ClienteDTO> clientes = new HashMap<>();

    @GetMapping
    public List<ClienteDTO> listClientes() {
        return new ArrayList<>(clientes.values());
    }

    @GetMapping("/{id}")
    public ClienteDTO getCliente(@PathVariable String id) {
        return clientes.get(id);
    }


}
