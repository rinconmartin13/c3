package com.c3.c3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("consulta")
public class ConsultaController {

    @GetMapping("consulta")
    public String getConsulta(){
        return ("camarada que ondaaaaaaaa");
    }
}
