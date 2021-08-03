import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        //UC4
        /*Mobile Format - E.g. 91 9919819801 - Country code follow by space and 10 digit number*/
        String regex4="^(0|91)?[ ][0-9]{10}$";
        System.out.println("Enter your phone number :");
        Scanner sc = new Scanner(System.in);
        String phoneNum = sc.nextLine();
        Pattern p4=Pattern.compile(regex4);
        Matcher m4= p4.matcher(phoneNum);
        boolean result4 =m4.matches();
        if (result4==true)  System.out.println("Valid");
        else System.out.println("please enter a Valid phone number");
    }
}
