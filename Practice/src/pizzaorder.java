/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MR
 */
import java.util.Scanner;

public class pizzaorder {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("\t Pizza delicious ");
        System.out.println("SizeS \n 1).Regular for 749/=. \n 2) Large for 999/= \n 3) X-Large for 1199/= ");
        int ord = input.nextInt();
        System.out.println("\t Select accordingle = " + ord);
        System.out.println("Flavors \n 1).Cheese Flavor. \n 2) Tikka Flavor \n 3) BBQ Flavor ");
        int flavor = input.nextInt();
        System.out.println("\t Select accordingle = " + flavor);
        switch (ord) {
            case 1 ->
                System.out.println("You have order Regular pizza ");
            case 2 ->
                System.out.println("You have order Large pizza ");
            case 3 ->
                System.out.println("You have order X-Regular pizza ");
            default -> {
            }
        }

        /////////////////////////////////////////////////////////
        switch (flavor) {
            case 1 ->
                System.out.println("You have order Cheese flavor ");
            case 2 ->
                System.out.println("You have order Tikka flavor  ");
            case 3 ->
                System.out.println("You have order BBQ flavor  ");
            default -> {
            }
        }
        ///////////////////////////////////////
        switch (ord) {
            case 1 ->
                ord = 749;
            case 2 ->
                ord = 999;
            case 3 ->
                ord = 1199;
        }
        System.out.print("Do you want to add some extra cheese for 100/=  \n 1) Yes \n 2) No :");
        int extra = input.nextInt();
        if(extra == 1)
            extra = 100;
        int total = ord + extra;
        System.out.println("Total is " + total);
    }

}
