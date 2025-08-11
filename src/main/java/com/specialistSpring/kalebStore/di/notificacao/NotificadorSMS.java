package com.specialistSpring.kalebStore.di.notificacao;

import com.specialistSpring.kalebStore.di.modelo.Cliente;
import org.springframework.stereotype.Component;

@TipoNotificador(NivelUrgencia.URGENCIA)
@Component
public class NotificadorSMS implements Notificador {

    @Override
    public void notificar(Cliente cliente, String mensagem) {
        System.out.println("Notificando " + cliente.getNome() + cliente.getEndereco() +" por SMS: " + mensagem);
    }

}
