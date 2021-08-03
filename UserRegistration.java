import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration Programme");
        // UC2
        /* Last name starts with Cap and has minimum 3 characters*/
        System.out.println("Enter your LastName :");
        String lastName = sc.nextLine();
        String regex2 = "^([A-Z]{1}+[a-z]{2,})$";
        Pattern p2 = Pattern.compile(regex2);
        Matcher m2 = p2.matcher(lastName);
        boolean result2 = m2.matches();
        if (result2 == true) {
            System.out.println("Valid");
        } else {
            System.out.println("please enter a Valid name");
        }
    }
}
