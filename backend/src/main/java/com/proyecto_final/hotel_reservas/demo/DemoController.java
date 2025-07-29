package com.proyecto_final.hotel_reservas.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("api/v1")
public class DemoController {
    
    @PostMapping(value = "demo")
    public String welcome(){
        return "Welcome from secure endpoint";
    }

}
