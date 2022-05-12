/**
 * User need to fallow pre-defined password rules
 * Rule 1:- Minimum 8 characters
 * Rule 2:- Should have at least 1 upper case
 * Rule 3:- Should have at least 1 numeric in the password
 * Rule 4:- Has exactly 1 special character
 */
package com.assignment19.bl;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password_isValid {

        public static void main(String[] args) {

            Scanner sc = new Scanner (System.in);
            String regex = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$";
            System.out.print("Enter Password  :- ");
            String password =sc.nextLine();

            Pattern pt = Pattern.compile(regex);

            if (password.matches(regex)) {
                System.out.println("Valid Password");
            } else {
                System.out.println("Invalid Password");
            }
    }
}
