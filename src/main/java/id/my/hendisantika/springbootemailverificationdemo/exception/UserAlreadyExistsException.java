package id.my.hendisantika.springbootemailverificationdemo.exception;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-email-verification-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2/27/24
 * Time: 07:51
 * To change this template use File | Settings | File Templates.
 */
public class UserAlreadyExistsException extends RuntimeException {
    public UserAlreadyExistsException(String message) {
        super(message);
    }
}
