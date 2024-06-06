package com.seubanco.banco_digital.sevice;

import com.seubanco.banco_digital.model.Cliente;
import com.seubanco.banco_digital.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> listarTodos() {
        return clienteRepository.findAll();
    }
}