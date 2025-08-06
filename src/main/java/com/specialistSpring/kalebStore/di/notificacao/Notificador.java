package com.specialistSpring.kalebStore.di.notificacao;

import com.specialistSpring.kalebStore.di.modelo.Cliente;

public interface Notificador {

    void notificar(Cliente cliente, String mensagem);

}
