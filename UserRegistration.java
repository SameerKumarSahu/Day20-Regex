import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        //UC8
        /*Rule4 – Has exactly 1 Special Character*/
        String regex8="^([A-Z]{1}[0-9]{1}[@!&$%#-_*+]{1}[a-zA-Z0-9]{5,})";
        System.out.println("Enter your password: ");
        Scanner sc = new Scanner(System.in);
        String passWord4 = sc.next();
        Pattern p8=Pattern.compile(regex8);
        Matcher m8= p8.matcher(passWord4);
        boolean result8 =m8.matches();
        if (result8==true)  System.out.println("Valid");
        else System.out.println("please enter a Valid password");

    }
}
