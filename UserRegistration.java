import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        //UC5
        /*Rule1-minimum 8 Characters*/
        String regex5="^[A-Za-z0-9@!&$%#-_*+]{8,}";
        System.out.println("Enter your password: ");
        Scanner sc = new Scanner(System.in);
        String passWord1 = sc.next();
        Pattern p5=Pattern.compile(regex5);
        Matcher m5= p5.matcher(passWord1);
        boolean result5 =m5.matches();
        if (result5==true)  System.out.println("Valid");
        else System.out.println("please enter a Valid password");
    }
}
