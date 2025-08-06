package com.specialistSpring.kalebStore.di.service;

import com.specialistSpring.kalebStore.di.modelo.Cliente;
import com.specialistSpring.kalebStore.di.notificacao.NotificadorEmail;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClienteService {
     private NotificadorEmail notificador;
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
