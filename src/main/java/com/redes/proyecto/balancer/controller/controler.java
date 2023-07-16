package com.redes.proyecto.balancer.controller;

import com.redes.proyecto.balancer.unutils.Unutils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controler {

    @GetMapping("/ping")
    public ResponseEntity<String> ping(){
        return new ResponseEntity<>("PONG",HttpStatus.OK);
    }

    @GetMapping("/processor")
    public ResponseEntity<Long> processor(@RequestParam Long iters){

        return new ResponseEntity<>(Unutils.sum(iters),HttpStatus.OK);
    }
}