import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        //UC6
        /*Rule2– Should have at least 1 Upper Case */
        String regex6="^([A-Z]{1}[a-zA-Z0-9@!&$%#-_*+]{7,})";
        System.out.println("Enter your password: ");
        Scanner sc = new Scanner(System.in);
        String passWord2 = sc.next();
        Pattern p6=Pattern.compile(regex6);
        Matcher m6= p6.matcher(passWord2);
        boolean result6 =m6.matches();
        if (result6==true)  System.out.println("Valid");
        else System.out.println("please enter a Valid password");
    }
}
