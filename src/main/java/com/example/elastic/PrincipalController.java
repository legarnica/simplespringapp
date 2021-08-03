package com.example.elastic;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class PrincipalController {

    @GetMapping("/saluda")
    public String saluda(){
        return "hola beanstalk";
    }
}
