package com.specialistSpring.brunoLanche.di.notificacao;

import com.specialistSpring.brunoLanche.di.modelo.Cliente;

public class NotificadorEmail {

    public void notificar(Cliente cliente, String mensagem) {
        System.out.println("Notificando " + cliente.getNome() + cliente.getEndereco() +" por e-mail: " + mensagem);
    }
}
