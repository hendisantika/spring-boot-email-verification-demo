package id.my.hendisantika.springbootemailverificationdemo.repository;

import id.my.hendisantika.springbootemailverificationdemo.entity.VerificationToken;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-email-verification-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2/27/24
 * Time: 07:45
 * To change this template use File | Settings | File Templates.
 */
public interface VerificationTokenRepository extends JpaRepository<VerificationToken, Long> {
    VerificationToken findByToken(String token);
}
