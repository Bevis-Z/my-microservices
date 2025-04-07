package com.example.aiservice.controllers;

import com.example.aiservice.model.dto.ChatMessageRequest;
import com.example.aiservice.services.aiConsultService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/consult")
public class AIConsultController {

    private final aiConsultService consultService;

    public AIConsultController(aiConsultService consultService) {
        this.consultService = consultService;
    }

    @GetMapping("/validate-patient-info")
    public ResponseEntity<String> validatePatientInfo(@RequestBody ChatMessageRequest request) {
        String result = consultService.getConsult(request);
        return ResponseEntity.ok(result);
    }
} 