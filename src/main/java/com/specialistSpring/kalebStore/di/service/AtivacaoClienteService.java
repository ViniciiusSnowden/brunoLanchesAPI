package com.specialistSpring.kalebStore.di.service;

import com.specialistSpring.kalebStore.di.modelo.Cliente;
import com.specialistSpring.kalebStore.di.notificacao.NivelUrgencia;
import com.specialistSpring.kalebStore.di.notificacao.Notificador;
import com.specialistSpring.kalebStore.di.notificacao.TipoNotificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class AtivacaoClienteService {

     //@TipoNotificador(NivelUrgencia.URGENCIA)
     //@Autowired
     private Notificador notificador;
    // private ClienteRepository clienteRepository;

    @Autowired
    private ApplicationEventPublisher eventPublisher;


    public void ativar(Cliente cliente) {
         cliente.ativar();

         eventPublisher.publishEvent(new ClienteAtivadorEvent(cliente));
         //notificador.notificar(cliente, "Seu cadastro está ativo!");
    }

}
