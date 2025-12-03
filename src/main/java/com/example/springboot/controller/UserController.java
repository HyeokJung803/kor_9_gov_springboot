package com.example.springboot.controller;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

// 1
@RestController
public class UserController {

    private String username = "test12";
    private String password = "1234";

    @GetMapping("/info")
    public ResponseEntity<String> printInfo() {
        return ResponseEntity.ok("UserController!!!");
    }

//    @GetMapping("/users")
//    public Map<String, String> getUsers(HttpServletResponse response) {
//        response.setStatus(400);
//        response.setContentType(("application/json"));
//        return Map.of("username", username, "password", password);
//    }

    @GetMapping("/users")
    public ResponseEntity<Map<String, String>> getUsers(HttpServletResponse response) {
        return ResponseEntity.status(HttpStatus.OK).body(Map.of("username", username, "password", password));
    }
}

