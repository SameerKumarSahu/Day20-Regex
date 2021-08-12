package com.Bridgelabz;

import java.util.function.Predicate;
import java.util.regex.Pattern;

public class UserRegistration {

	public static void main(String[] args) {
		 String FIRST_NAME_PATTERN = "[A-Z]{1}[a-zA-Z]{2,}";
		 String LAST_NAME_PATTERN = "[A-Z]{1}[a-zA-Z]{2,}";
		 String EMAIL_ID_PATTERN = "^[a-zA-Z]+[-+.]{0,1}[a-zA-Z0-9]+@[A-Za-z0-9]+(.[A-Za-z]{2,4}){1,2}$";
		 String MOBILE_NUMBER_PATTERN = "[1-9]{1}[0-9]{1}( )[1-9]{1}[0-9]{9}";
		 String PASSWORD_PATTERN = "(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&-+=()])[a-zA].{8,}$";

		Predicate<String> validFirstName = (String firstName) -> {
			Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
			boolean result = pattern.matcher(firstName).matches();
			return result;
		};

		Predicate<String> validLastName = (String lastName) -> {
			boolean result = Pattern.matches(LAST_NAME_PATTERN, lastName);
			return result;
		};

		Predicate<String> validEmailId = (String emailId) -> {
			boolean result = Pattern.matches(EMAIL_ID_PATTERN, emailId);
			return result;

		};

		Predicate<String> validMobileNumber = (String mobileNumber) -> {
			boolean result = Pattern.matches(MOBILE_NUMBER_PATTERN, mobileNumber);
			return result;
		};

		Predicate<String> validPassword = (String password) -> {
			boolean result = Pattern.matches(PASSWORD_PATTERN, password);
			return result;
		};

		System.out.println(validFirstName.test("Sajaya"));
		System.out.println(validLastName.test("Singh"));
		System.out.println(validEmailId.test("singh@gmail.com"));
		System.out.println(validMobileNumber.test("91 9874556321"));
		System.out.println(validPassword.test("Akdfjk12@"));

	}
}
