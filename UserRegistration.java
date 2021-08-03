import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        //UC3
        /*E.g. abc.xyz@bl.co.in - Email has 3 mandatory parts (abc, bl& co) and 2 optional (xyz & in) withprecise @ and . positions*/

        String regex3=("^[a-z]*([.]?[a-z]+)*@bl[.]co([.]?in)*");
        System.out.println("Enter your mail address :");
        Scanner sc = new Scanner(System.in);
        String eMail = sc.nextLine();
        Pattern p3=Pattern.compile(regex3);
        Matcher m3= p3.matcher(eMail);
        boolean result3 =m3.matches();
        if (result3==true) {
            System.out.println("Valid");
        } else {
            System.out.println("please enter a Valid mail adress");
        }
    }
}
