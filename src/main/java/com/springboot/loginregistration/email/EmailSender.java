package com.springboot.loginregistration.email;

public interface EmailSender {
    void send(String to, String email);
}
