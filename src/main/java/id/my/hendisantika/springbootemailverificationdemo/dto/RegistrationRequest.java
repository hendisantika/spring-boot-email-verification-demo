package id.my.hendisantika.springbootemailverificationdemo.dto;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-email-verification-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2/27/24
 * Time: 07:49
 * To change this template use File | Settings | File Templates.
 */
public record RegistrationRequest(
        String firstName,
        String lastName,
        String email,
        String password,
        String role) {
}
