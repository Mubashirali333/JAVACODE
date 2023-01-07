/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Salman
 */
public class StringCompare {

    public static void main(String[] args) {
//        String str1 = "Java Programming";
//        String str2 = "Java Programming";
//        if(str1 == str2)
//            System.out.println("Both Strings are Equal");
//        else
//            System.out.println("Sorry Strings are Not Equal");

        String str1 = new String("Java Programming");
        String str2 = new String("Java Programming");

        if (str1.equals(str2)) 
        {
            System.out.println("Both Strings are Equal");
        } 
        else {
            System.out.println("Sorry Strings are Not Equal");
        }
    }
}
