import java.util.regex.Pattern;

public class MailTest {
    public static void main(String[] args) {
        MailTest user = new MailTest();
        user.checkMail("abc@yahoo.com");
        user.checkMail("abc-100@yahoo.com");
        user.checkMail("abc.100@yahoo.com");
        user.checkMail("abc111@abc.com");
        user.checkMail("abc-100@abc.net");
        user.checkMail("abc.100@abc.com.au");
        user.checkMail("abc@1.com");
        user.checkMail("abc@gmail.com.com");
        user.checkMail("abc+100@gmail.com.com");
    }

    public void checkMail(String eMail) {
        boolean check = Pattern.matches("[a-zA-Z0-9_.]*[-]*[+]*[0-9]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+", eMail);
        if (check)
            System.out.println("Email address Matched");
        else
            System.out.println("Please Enter a Valid mail address e.g example.abc@bl.co.in");
    }
}
