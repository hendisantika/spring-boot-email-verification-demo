package id.my.hendisantika.springbootemailverificationdemo.controller;

import id.my.hendisantika.springbootemailverificationdemo.dto.RegistrationRequest;
import id.my.hendisantika.springbootemailverificationdemo.entity.User;
import id.my.hendisantika.springbootemailverificationdemo.event.RegistrationCompleteEvent;
import id.my.hendisantika.springbootemailverificationdemo.repository.VerificationTokenRepository;
import id.my.hendisantika.springbootemailverificationdemo.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-email-verification-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2/27/24
 * Time: 07:54
 * To change this template use File | Settings | File Templates.
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/register")
public class RegistrationController {

    private final UserService userService;
    private final ApplicationEventPublisher publisher;
    private final VerificationTokenRepository tokenRepository;

    @PostMapping
    public String registerUser(@RequestBody RegistrationRequest registrationRequest, final HttpServletRequest request) {
        User user = userService.registerUser(registrationRequest);
        publisher.publishEvent(new RegistrationCompleteEvent(user, applicationUrl(request)));
        return "Success!  Please, check your email for to complete your registration";
    }
}
