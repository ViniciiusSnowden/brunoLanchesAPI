package com.specialistSpring.brunoLanche.di.service;

import com.specialistSpring.brunoLanche.di.modelo.Cliente;

public class AtivacaoClienteService {
    // private Notificador notificador;
    // private ClienteRepository clienteRepository;

    // public AtivacaoClienteService(Notificador notificador, ClienteRepository clienteRepository) {
    //     this.notificador = notificador;
    //     this.clienteRepository = clienteRepository;
    // }

    public void ativar(Cliente cliente) {
        cliente.setAtivo(true);
        // clienteRepository.save(cliente);
        // notificador.notificar(cliente, "Seu cadastro está ativo!");
    }
}
