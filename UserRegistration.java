package org.example;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserRegistration user = new UserRegistration();
        System.out.println("Welcome to User Registration Program");
    }
    //Firstname
    public boolean firstNameCheck(String str) {
        boolean check = Pattern.matches("^[A-Z]{1}+[a-z]{3,}$", str);
        if (check)
            System.out.println("Valid FirstName ");
        else
            System.out.println("Please Enter a Valid First name with staring letter Capital");
        return check;
    }
    //Lastname
    public boolean lastNameCheck(String str) {
        boolean check = Pattern.matches("^[A-Z]{1}+[a-z]{3,}$", str);
        if (check)
            System.out.println("Valid LastName");
        else
            System.out.println("Please Enter a Valid Last Name with staring letter Capital");
        return check;
    }
    //Email
    public boolean email(String str) {
        boolean check = Pattern.matches("^[a-z]*([.]?[a-z]+)*@bl[.]co([.]?in)*", str);
        if (check)
            System.out.println("Valid Email address");
        else
            System.out.println("Please Enter a Valid Email address as given in example xyz.abc@bl.co.in");
        return check;
    }
    //Phone Number
    public boolean mobileNum(String str) {
        boolean check = Pattern.matches("^91\\s[6789][0-9]{9}", str);
        if (check)
            System.out.println("Valid MobileNumber ");
        else
            System.out.println("Please Enter a Valid Mobile Number e.g 91 8965471234");
        return check;
    }
        // Password should have minimum 8 characters with, 1 upper case, 1 Numeric and 1 Special Char
    public boolean passWord(String str) {
        boolean check = Pattern.matches("[A-Z]{1}[a-z]{5,}[0-9]{1}[!@#$%^&*~]{1}", str);
        if (check)
            System.out.println("Valid Password");
        else
            System.out.println("Please Enter a Valid password and it should have minimum 8 characters with, 1 upper case, 1 Numeric and 1 Special Char ");
        return check;
    }


}