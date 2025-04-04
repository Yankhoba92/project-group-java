package com.sakila.intro.controllers;

import com.sakila.intro.services.BeanService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
    @RequestMapping("/check")
public class CheckController {

    private final BeanService beanService;

    public CheckController(BeanService beanService) {
        this.beanService = beanService;
    }

    @GetMapping
    public String check(){
        String msg = String.format("<div style='text-align:center;'><h1 style='text-align:center;color : green'>Server/Services Start Up at : %s </h1>"
                +"<p  style='text-align:center;color : blue'>Server Current Date/Time :%s</p>"
                +"<p><a href='/sakila/city'>Cities</a></p>",beanService.dateTime(), LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS")));
        msg += "</div>" ;
        return msg;
    }
}
