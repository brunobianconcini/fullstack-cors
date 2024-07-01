package com.bruno.cors.backend.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bruno.cors.backend.dtos.ContentDto;

//@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class GreetingsController {

    @GetMapping("/greetings")
    public ResponseEntity<ContentDto> greetings() {
        return ResponseEntity.ok(new ContentDto("Hello from backend!"));
    }
}
