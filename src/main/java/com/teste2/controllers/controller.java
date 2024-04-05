package com.teste2.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class controller {
    
    @GetMapping("/hello")
    String exibirMensagem() {
        return "Welcome to my channel";
    }
    
}
