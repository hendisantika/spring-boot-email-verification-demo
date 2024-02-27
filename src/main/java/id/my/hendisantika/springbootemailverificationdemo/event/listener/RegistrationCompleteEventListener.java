package id.my.hendisantika.springbootemailverificationdemo.event.listener;

import id.my.hendisantika.springbootemailverificationdemo.entity.User;
import id.my.hendisantika.springbootemailverificationdemo.event.RegistrationCompleteEvent;
import id.my.hendisantika.springbootemailverificationdemo.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-email-verification-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2/27/24
 * Time: 07:53
 * To change this template use File | Settings | File Templates.
 */
@Slf4j
@Component
@RequiredArgsConstructor
public class RegistrationCompleteEventListener implements ApplicationListener<RegistrationCompleteEvent> {
    private final UserService userService;

    private final JavaMailSender mailSender;
    private User theUser;
}
