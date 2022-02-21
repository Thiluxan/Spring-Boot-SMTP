package com.example.demo_email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailController {

    @Autowired
    MailServiceImpl mailService;

    @GetMapping("/email")
    public void sendEmail() {

        Mail mail = new Mail();
        mail.setMailFrom("");
        mail.setMailTo("");
        mail.setMailSubject("Sample Email");
        mail.setMailContent("Welcome to Sample Mail\n\nThanks");

        mailService.sendEmail(mail);
    }
}
