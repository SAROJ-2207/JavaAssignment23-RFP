/**
 * User Enter Valid First And Last Name
 * First name start with capital and has minimum 3 character.
 * Last name start with capital and has minimum 3 character.
 */
package com.assignment19.bl;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class FirstLastName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String re = "^[A-Z][a-z]{3,}$";

        System.out.print("Enter First Name :- ");
        String fname =sc.nextLine();

        System.out.print("Enter Last Name :- ");
        String lname =sc.nextLine();

        Pattern pt = Pattern.compile(re);
        Matcher mt1 = pt.matcher(fname);
        Matcher mt2 = pt.matcher(lname);

        boolean fresult =mt1.matches();
        boolean lresult =mt2.matches();
        System.out.print(" First Name Result :- "+fresult);
        System.out.print("\n Last  Name Result :- "+lresult);
    }
}

