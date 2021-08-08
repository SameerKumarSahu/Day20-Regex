package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    // Creating an object
    UserRegistration user = new UserRegistration();
    // Testing the Firstname
    @Test
    public void checkFirstName(){
        String fistName = "Sanjaya";
        boolean check = user.firstNameCheck(fistName);
        assertTrue(check);
    }
    // Testing the LastName
    @Test
    public void checkLastName(){
        String lastName = "Mahapatro";
        boolean check = user.lastNameCheck(lastName);
        assertTrue(check);
    }
    // Testing the Email Address
    @Test
    public void checkEmail(){
        String eMail = "abc.xyz@bl.co.in";
        boolean check = user.email(eMail);
        assertTrue(check);
    }
    // Testing the Phone Number
    @Test
    public void checkMobileNum(){
        String phoneNum = "91 8523697412";
        boolean check = user.mobileNum(phoneNum);
        assertTrue(check);
    }
    // Testing the Password
    @Test
    public void checkPwd(){
        String pwd = "Sanjaya5@";
        boolean check = user.passWord(pwd);
        assertTrue(check);
    }

}
