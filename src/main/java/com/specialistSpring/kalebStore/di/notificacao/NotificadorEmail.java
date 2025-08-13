package com.specialistSpring.kalebStore.di.notificacao;

import com.specialistSpring.kalebStore.di.modelo.Cliente;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;


@TipoNotificador(NivelUrgencia.NAO_URGENTE)
@Component
public class NotificadorEmail implements Notificador {

    private boolean caixaAlta;

    @Override
    public void notificar(Cliente cliente, String mensagem) {
        System.out.println("Notificando " + cliente.getNome() + cliente.getEndereco() +" por e-mail: " + mensagem);
    }
}
