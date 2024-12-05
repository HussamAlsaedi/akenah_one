package org.example.akenah.Services;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class EmailSenderService {

    private final JavaMailSender javaMailSender;




    @Async
    public void sendMail(String to, String subject, String content) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(to);
        message.setFrom("alsaedihussam449@gmail.com");
        message.setSubject(subject);
        message.setText(content);
        javaMailSender.send(message);
        System.out.println("Email sent");
    }
}
