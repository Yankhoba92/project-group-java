package com.sakila.intro.controllers;

import com.sakila.intro.services.StaffService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
    @RequestMapping("/staff")
public class StaffController {

    private final StaffService service;

    public StaffController(StaffService service) {
        this.service = service;
    }

    @GetMapping(value = "/picture/{id}", produces = MediaType.IMAGE_JPEG_VALUE )
    public byte[] getPicture(@PathVariable("id") Integer id) {
        return service.getPicture(id);
    }
}
