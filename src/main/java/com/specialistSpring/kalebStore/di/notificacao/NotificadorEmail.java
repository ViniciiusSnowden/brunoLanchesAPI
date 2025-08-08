package com.specialistSpring.kalebStore.di.notificacao;

import com.specialistSpring.kalebStore.di.modelo.Cliente;

public class NotificadorEmail implements Notificador {

    private boolean caixaAlta;
    private String hostServidorSmtp;

    public NotificadorEmail(String hostServidorSmtp){
        this.hostServidorSmtp = hostServidorSmtp;
    }


    @Override
    public void notificar(Cliente cliente, String mensagem) {
        if(this.caixaAlta){
            mensagem = mensagem.toUpperCase();
        }

        System.out.println("Notificando " + cliente.getNome() + cliente.getEndereco() +" por e-mail: " + mensagem);
    }


    public boolean isCaixaAlta() {
        return caixaAlta;
    }

    public void setCaixaAlta(boolean caixaAlta) {
        this.caixaAlta = caixaAlta;
    }
}
