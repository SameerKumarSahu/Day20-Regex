import java.util.regex.Pattern;

public class ValidateMultipleMail {
    public boolean emailUniversal(String eMail) {
        boolean check = Pattern.matches("[a-zA-Z0-9_.]*[-]*[+]*[0-9]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+", eMail);
        if (check)
            System.out.println("Mail address matched");
        else
            System.out.println("Please Enter a Valid Email address as given in example i.e xyz.abc@bl.co.in");
        return check;
    }
}
