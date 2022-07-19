package com.c3.c3.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("consulta")
public class ConsultaController {

    @RequestMapping("consulta")
    public String getConsulta(){
        return ("Consulta hecha");
    }
}
