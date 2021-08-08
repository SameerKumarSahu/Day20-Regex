package org.example;

import java.util.regex.Pattern;

public class UserRegistrationException {

    public boolean firstName(String fName) {
        boolean check = Pattern.matches("^[A-Z]{1}+[a-z]{3,}", fName);
        try {
            if (check) {
                System.out.println("Valid FirstName ");
                return true;
            } else {
                throw new CustomsException("Please Enter a Valid First name with staring letter Capital");
            }
        } catch (CustomsException e) {
            System.out.println(e);
        }
        return false;
    }

    public boolean lastName(String lName) {
        boolean check = Pattern.matches("^[A-Z]{1}+[a-z]{3,}", lName);
        try {
            if (check) {
                System.out.println("Valid LastName");
                return true;
            } else {
                throw new CustomsException("Please Enter a Valid Last Name with staring letter Capital");
            }
        } catch (CustomsException e) {
            System.out.println(e);
        }
        return false;
    }


    public boolean eMail(String eMail) {
        boolean check = Pattern.matches("^[a-z]*([.]?[a-z]+)*@bl[.]co([.]?in)*", eMail);
        try {
            if (check) {
                System.out.println("Valid Email address");
                return true;
            } else {
                throw new CustomsException("Please Enter a Valid Email address as given in example xyz.abc@bl.co.in");
            }
        } catch (CustomsException e) {
            System.out.println(e);
        }
        return false;
    }

    public boolean mobileNum(String mNum) {
        boolean check = Pattern.matches("^91\\s[6789][0-9]{9}", mNum);
        try {
            if (check) {
                System.out.println("Valid MobileNumber ");
                return true;
            } else {
                throw new CustomsException("Please Enter a Valid Mobile Number e.g 91 8965471234");
            }
        } catch (CustomsException e) {
            System.out.println(e);
        }
        return false;
    }

    // Password should have minimum 8 characters with, 1 upper case, 1 Numeric and 1 Special Char
    public boolean pwd(String pwd) {
        boolean check = Pattern.matches("[A-Z]{1}[a-z]{5,}[0-9]{1}[!@#$%^&*~]{1}", pwd);
        try {
            if (check) {
                System.out.println("Valid Password");
                return true;
            } else {
                throw new CustomsException("Please Enter a Valid password and it should have minimum 8 characters with, 1 upper case, 1 Numeric and 1 Special Char ");
            }
        } catch (CustomsException e) {
            System.out.println(e);
        }
        return false;
    }

    // this is code for which satisfies for all emails given to check
    public boolean emailUniversal(String eMail) {
        boolean check = Pattern.matches("[a-zA-Z0-9_.]*[-]*[+]*[0-9]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+", eMail);
        try {
            if (check) {
                System.out.println("Perfect! #Email");
                return true;
            } else {
                throw new CustomsException("Please Enter a Valid Email with Only \"example.abc@bl.co.in\" latter");
            }
        } catch (CustomsException e) {
            System.out.println(e);
        }
        return false;
    }

}
