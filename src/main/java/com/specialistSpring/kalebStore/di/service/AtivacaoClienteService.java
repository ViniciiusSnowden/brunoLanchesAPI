package com.specialistSpring.kalebStore.di.service;

import com.specialistSpring.kalebStore.di.modelo.Cliente;
import com.specialistSpring.kalebStore.di.notificacao.NivelUrgencia;
import com.specialistSpring.kalebStore.di.notificacao.Notificador;
import com.specialistSpring.kalebStore.di.notificacao.TipoNotificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class AtivacaoClienteService {

     @TipoNotificador(NivelUrgencia.URGENCIA)
     @Autowired
     private Notificador notificador;
    // private ClienteRepository clienteRepository;

    @PostConstruct
    public void init(){
        System.out.println("Init" + notificador);
    }

    @PreDestroy
    public void detroy(){
        System.out.println("Destory");
    }

    public void ativar(Cliente cliente) {
         //clienteRepository.save(cliente);
         notificador.notificar(cliente, "Seu cadastro está ativo!");
    }

}
