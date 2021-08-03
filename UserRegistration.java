import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        //UC7
        /*Rule3 – Should have at least 1 numeric number in the password*/
        String regex7="^([A-Z]{1}[0-9]{1}[a-zA-Z0-9@!&$%#-_*+]{6,})";
        System.out.println("Enter your password: ");
        Scanner sc = new Scanner(System.in);
        String passWord3 = sc.next();
        Pattern p7=Pattern.compile(regex7);
        Matcher m7= p7.matcher(passWord3);
        boolean result7 =m7.matches();
        if (result7==true)  System.out.println("Valid");
        else System.out.println("please enter a Valid password");

    }
}
