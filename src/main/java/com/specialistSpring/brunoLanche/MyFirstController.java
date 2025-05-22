package com.specialistSpring.brunoLanche;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyFirstController {
    // This is a placeholder for the controller logic
    // You can add methods to handle requests and responses here

    // Example method
    @GetMapping("/hello")
    @ResponseBody
    public String helloWorld() {
        return "Hello, World!";
    }
}
