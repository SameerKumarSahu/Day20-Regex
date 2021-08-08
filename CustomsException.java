package org.example;

public class CustomsException extends Throwable {
    public CustomsException(String sms){
        super(sms);
    }

}