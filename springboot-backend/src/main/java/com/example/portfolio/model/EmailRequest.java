package com.example.portfolio.model;

/**
 * Data transfer object for email request details.
 */
public class EmailRequest {
    private String from; // Sender's email
    private String to; // Recipient's email
    private String subject;
    private String message;


    public String getSubject() {
        return subject;
    }

    public String getMessage() {
        return message;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setTo(String to) {
        this.to = to;
    }
}
