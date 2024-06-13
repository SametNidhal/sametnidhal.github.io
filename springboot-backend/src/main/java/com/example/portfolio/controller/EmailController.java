package com.example.portfolio.controller;

import com.example.portfolio.model.EmailRequest;
import com.example.portfolio.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EmailController {

    @Autowired
    private MailService mailService;

    @PostMapping("/send-email")
    public ResponseEntity<?> sendEmail(@RequestBody EmailRequest emailRequest) {
        mailService.sendEmail("a@gmail.com", emailRequest.getSubject(), emailRequest.getMessage());
        return ResponseEntity.ok("Email Email sent successfully");
    }
}
