package com.example.portfolio.controller;

import com.example.portfolio.model.EmailRequest;
import com.example.portfolio.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
* REST controller for handling email sending requests.
 */
@RestController
@RequestMapping("/api")
public class EmailController {

    @Autowired
    private MailService mailService;

    @PostMapping("/send-email")
    public ResponseEntity<?> sendEmail(@RequestBody EmailRequest emailRequest) {
        mailService.sendEmail(emailRequest.getFrom(), emailRequest.getTo(), emailRequest.getSubject(), emailRequest.getMessage());
        return ResponseEntity.ok("Email Email sent successfully");
    }
}
