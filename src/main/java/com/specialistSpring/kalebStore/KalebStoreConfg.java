package com.specialistSpring.kalebStore;


import com.specialistSpring.kalebStore.di.notificacao.NotificadorEmail;
import com.specialistSpring.kalebStore.di.service.AtivacaoClienteService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KalebStoreConfg {

    @Bean
    public NotificadorEmail notificadorEmail(){
        NotificadorEmail notificador = new NotificadorEmail("smtp.kalebstoremail.com.br");
        notificador.setCaixaAlta(true);

        return notificador;
    }

}
