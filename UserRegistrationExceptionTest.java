package org.example;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class UserRegistrationExceptionTest
{
    UserRegistrationException user = new UserRegistrationException();
    // This test case will pass while running
    @Test
    public void firstName(){
        String fName = "Pritpal";
        boolean check = user.firstName(fName);
        assertTrue(check);
    }
    // This test case will fail while running
    @Test
    public void fName(){
        String fName = "pritpal";
        boolean check = user.firstName(fName);
        assertTrue(check);
    }

    @Test
    public void lastName(){
        String lName = "Singh";
        boolean check = user.lastName(lName);
        assertTrue( check);
    }

    @Test
    public void email(){
        String eMail = "abc.xyz@bl.co.in";
        boolean check = user.eMail(eMail);
        assertTrue(check);
    }

    @Test
    public void mobileNum(){
        String mobile = "91 8965741365";
        boolean check = user.mobileNum(mobile);
        assertTrue(check);
    }

    @Test
    public void passWordRule4(){
        String pass = "Pretpal1@";
        boolean check = user.pwd(pass);
        assertTrue(check);
    }
}
