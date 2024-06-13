package com.example.portfolio.service;

public interface MailService {
    void sendEmail(String to, String subject, String content);
}
