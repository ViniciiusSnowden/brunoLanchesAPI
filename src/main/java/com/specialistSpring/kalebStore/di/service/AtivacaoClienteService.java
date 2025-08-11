package com.specialistSpring.kalebStore.di.service;

import com.specialistSpring.kalebStore.di.modelo.Cliente;
import com.specialistSpring.kalebStore.di.notificacao.NivelUrgencia;
import com.specialistSpring.kalebStore.di.notificacao.Notificador;
import com.specialistSpring.kalebStore.di.notificacao.TipoNotificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClienteService {

     @TipoNotificador(NivelUrgencia.URGENCIA)
     @Autowired
     private Notificador notificador;
    // private ClienteRepository clienteRepository;


    public void ativar(Cliente cliente) {
         //clienteRepository.save(cliente);
         notificador.notificar(cliente, "Seu cadastro está ativo!");
    }

}
