package org.junit;


import java.util.regex.Pattern;

public class RegexJava {

    public static boolean firstName(String firstName) {
        /*
         * To define regex for first name and matching first name with the give expression for the first three letters
         */
        Pattern obj = Pattern.compile("\\p{Upper}(\\p{Lower}+\\s?){3}");
        return obj.matcher(firstName).matches();


    }

    /*
     * To define regex for last name and matching last name with the give expression for the first three letters
     */

    public static boolean lastName(String lastName) {
        /*
         * To define regex for first name and matching first name with the give expression for the first three letters
         */
        Pattern obj = Pattern.compile("\\p{Upper}(\\p{Lower}+\\s?){2}\", Name");
        return obj.matcher(lastName).matches();


    }
}
