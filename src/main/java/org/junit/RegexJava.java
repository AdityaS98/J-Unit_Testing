package org.junit;


import java.util.regex.Pattern;

public class RegexJava {

    public  boolean firstName(String firstName) {
        /*
         * To define regex for first name and matching first name with the give expression for the first three letters
         */
        Pattern obj = Pattern.compile("\\p{Upper}(\\p{Lower}+\\s?){3}");
        return obj.matcher(firstName).matches();


    }

    /*
     * To define regex for last name and matching last name with the give expression for the first three letters
     */

    public  boolean lastName(String lastName) {
        /*
         * To define regex for first name and matching first name with the give expression for the first three letters
         */
        Pattern obj = Pattern.compile("\\p{Upper}(\\p{Lower}+\\s?){2}\", lastName");
        return obj.matcher(lastName).matches();


    }

    public  boolean eMail(String Email) {
        /*
         * To define regex for email and matching email with the give expression
         */
        Pattern obj = Pattern.compile("[a-z]+[.]?[a-z]{0,}[@][a-z]+[.][a-z]{2,4}[.]?[a-z]{0,2}");
        return obj.matcher(Email).matches();


    }

    public  boolean PasswordCheck1(String Password1) {
        /*
         * To define regex for password and matching email with the give expression
         */
        Pattern obj = Pattern.compile("[a-z]{8,}");
        return obj.matcher(Password1).matches();


    }

    public  boolean PasswordCheck2(String Password2) {
        /*
         * To define regex for password and matching email with the give expression
         */
        Pattern obj = Pattern.compile("[a-z]{7,}[A-Z]{1,}");
        return obj.matcher(Password2).matches();


    }

    public  boolean PasswordCheck3(String Password3) {
        /*
         * To define regex for password and matching email with the give expression
         */
        Pattern obj = Pattern.compile("\"[a-z]{6,}[A-Z]{1,}[0-9]{1,}\"");
        return obj.matcher(Password3).matches();


    }


}
