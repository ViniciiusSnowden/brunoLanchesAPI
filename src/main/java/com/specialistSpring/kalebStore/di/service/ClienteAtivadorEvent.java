package com.specialistSpring.kalebStore.di.service;

import com.specialistSpring.kalebStore.di.modelo.Cliente;

public class ClienteAtivadorEvent {

    private Cliente cliente;

    public ClienteAtivadorEvent(Cliente cliente){
        super();
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
