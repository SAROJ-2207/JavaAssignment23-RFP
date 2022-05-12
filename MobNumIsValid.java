/**
 *  Check Mobile Number is Valid Or Invalid
 *  Country code follow by space and 10 digit number
 */

package com.assignment19.bl;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobNumIsValid {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String regex = "/^([+]\\d{2}[ ])?\\d{10}$/";
        System.out.print("Enter Mobile Number  :- ");
        String mnum =sc.nextLine();

        Pattern pt = Pattern.compile(regex);
        Matcher mt = pt.matcher(mnum);

        boolean mnum_result =mt.matches();
        System.out.print("Mobile Number :- "+mnum_result);
    }
}
