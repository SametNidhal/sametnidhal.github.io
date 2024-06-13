package com.example.portfolio.service.serviceImp;

import com.example.portfolio.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailServiceImpl implements MailService {

    @Autowired
    private JavaMailSender mailSender;

    @Override
    public void sendEmail(String to, String subject, String content) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("nsamet21@gmail.com");
        message.setTo(to);
        message.setSubject(subject);
        message.setText(content);
        mailSender.send(message);
    }
}
