package com.specialistSpring.kalebStore;


import com.specialistSpring.kalebStore.di.modelo.Cliente;
import com.specialistSpring.kalebStore.di.service.AtivacaoClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyFirstController {
    // This is a placeholder for the controller logic
    // You can add methods to handle requests and responses here
    @Autowired
    private AtivacaoClienteService ativacaoClienteService;

    // Example method
    @GetMapping("/hello")
    @ResponseBody
    public String helloWorld() {
        Cliente joao = new Cliente("Jão", "13 maio","8181872",false );

        ativacaoClienteService.ativar(joao);
        return "Hello, World!2 paulo 30";
    }
}
