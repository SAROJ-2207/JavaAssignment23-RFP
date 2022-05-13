/**
 * Use Lambda Function to validate First Name,
 * Last Name, Email, Mobile, and Password
 */

package com.assignment23;

public class ValidUserEntry {

    @FunctionalInterface
    public interface Validate {
        public boolean validateName(String name);
    }

    public static Validate validateFirstName() {
        return firstName -> firstName.matches("^[A-Z][a-z]{3,}$");
    }

    public static Validate validateLastName() {

        return lastName -> lastName.matches("^[A-Z][a-z]{3,}$");
    }
    
    public static Validate valideEmail() {

        return emailValid -> emailValid.matches("^[a-z+.]+@(.+)$");
    }
    
    public static Validate validMobileNumber() {

        return numberValid -> numberValid.matches("/^([+]\\d{2}[ ])?\\d{10}$/");
    }
    
    public static Validate validPassword() {

        return passwordValid -> passwordValid.matches("^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$");
    }
    
    
    	public static void main(String[] args) {
        boolean isValidFirstName = ValidUserEntry.validateFirstName().validateName("Saroj");
        System.out.println("First Name :- "+isValidFirstName);

        boolean isValidLastName = ValidUserEntry.validateLastName().validateName("Sahoo");
        System.out.println("Last Name :- "+isValidLastName);
        
        boolean isValidEmail = ValidUserEntry.valideEmail().validateName("sksaroj828@gmail.com");
        System.out.println("Email-Id :- "+isValidEmail);
        
        boolean isValidMobileNumber = ValidUserEntry.validMobileNumber().validateName("+91 7606863893");
        System.out.println("Mobile Number :- "+isValidMobileNumber);
        
        boolean isValidPassword = ValidUserEntry.validPassword().validateName("saroj@123456");
        System.out.println("Password :- "+isValidPassword);
                
    }
}


