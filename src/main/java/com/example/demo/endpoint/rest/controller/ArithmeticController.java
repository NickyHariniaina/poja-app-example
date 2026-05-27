package com.example.demo.endpoint.rest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.ArithmeticService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class ArithmeticController {

    private final ArithmeticService arithmeticService;

    @GetMapping("/add")
    public ResponseEntity<?> add(
            @RequestParam int a,
            @RequestParam int b) {
        try {
            return ResponseEntity.status(200).body(arithmeticService.add(a, b));
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(400).body(e.getMessage());
        } catch (RuntimeException e) {
            return ResponseEntity.status(500).body(e.getMessage());
        }
    }

    @GetMapping("/subtract")
    public ResponseEntity<?> subtract(
            @RequestParam int a,
            @RequestParam int b) {
        try {
            return ResponseEntity.status(200).body(arithmeticService.subtract(a, b));
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(400).body(e.getMessage());
        } catch (RuntimeException e) {
            return ResponseEntity.status(500).body(e.getMessage());
        }
    }

    @GetMapping("/multiply")
    public ResponseEntity<?> multiply(
            @RequestParam int a,
            @RequestParam int b) {
        try {
            return ResponseEntity.status(200).body(arithmeticService.multiply(a, b));
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(400).body(e.getMessage());
        } catch (RuntimeException e) {
            return ResponseEntity.status(500).body(e.getMessage());
        }
    }

    @GetMapping("/divide")
    public ResponseEntity<?> divide(
            @RequestParam int a,
            @RequestParam int b) {
        try {
            return ResponseEntity.status(200).body(arithmeticService.divide(a, b));
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(400).body(e.getMessage());
        } catch (RuntimeException e) {
            return ResponseEntity.status(500).body(e.getMessage());
        }
    }

}
