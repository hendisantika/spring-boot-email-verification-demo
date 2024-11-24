# spring-boot-email-verification-demo

### Things todo list

1. Clone this repository: `git clone https://github.com/hendisantika/spring-boot-email-verification-demo.git`
2. Navigate to the folder: `cd spring-boot-email-verification-demo`
3. Change with your DB & SMTP E-Mail credentials in `application.yml` file
4. Run the application: `mvn clean spring-boot:run`
5. Open HTTP Client App (Postman, Insomnia or API Dog)

Add New User

```shell
###
POST http://localhost:8081/register
Content-Type: application/json

{
  "firstName": "ITADORI",
  "lastName": "YUJI",
  "email": "yuji@yopmail.com",
  "password": "1234",
  "role": "ADMIN"
}
```

### Image Screenshot

Send E-Mail API

![Send E-Mail API](img/send_email.png "Send E-Mail API")

Verification E-Mail

![Verification E-Mail](img/verification_email.png "Verification E-Mail")

E-Mail Verified

![E-Mail Verified](img/verified.png "E-Mail Verified")

Database State

![Database State](img/db.png "Database State")
