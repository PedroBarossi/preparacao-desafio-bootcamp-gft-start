package com.dio.service.impl;

import com.dio.model.Cliente;
import com.dio.service.ClienteService;
import org.springframework.stereotype.Service;

@Service
public class ClienteServicImpl implements ClienteService {
    @Override
    public Iterable<Cliente> buscarTodos() {
        return null;
    }

    @Override
    public Cliente buscarPorId(Long id) {
        return null;
    }

    @Override
    public void inserir(Cliente cliente) {

    }

    @Override
    public void atualizar(Long id, Cliente cliente) {

    }

    @Override
    public void deletar(Long id) {

    }
}
