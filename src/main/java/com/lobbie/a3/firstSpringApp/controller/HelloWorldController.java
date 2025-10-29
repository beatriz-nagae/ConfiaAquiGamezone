package com.lobbie.a3.firstSpringApp.controller;



import com.lobbie.a3.firstSpringApp.service.HelloWorldService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// STATLESS -> a cada nova requisição eu recebo td que eu preciso
//STATEFUL -> o estado de cada cliente é mantido no servidor, oq ele fez
//na sessão anterior, se ta block de algo enfimmmm
@RequestMapping("/hello-world")
//ENDPOINT. quais paths a classe vai estar ouvindo
//Ja vem com o parametro que é "/hello-world". ou seja, ouve ai.
public class HelloWorldController {

    private HelloWorldService helloWorldService;

    public HelloWorldController(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    @GetMapping
// ouve no GET /hello-world
    public String helloWorld() {
        return helloWorldService.helloWorld(" Lobbie");
    }
}