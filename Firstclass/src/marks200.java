/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MR
 */
import java.util.Scanner;

public class marks200 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ms[] = new String[12];

        int obt = 0;
        float per = 0.0f;
        String grade = null;
        int rep = 0 ;

        //////////////////////////////////////
        String[] captions = {"Student Id ","Student Name ","Father Name ","Java programming ","Data structures ","Islamiyat ","Comunication skills ","Mathematics ","Obtained marks ","Percentage ","Grade "};
        
        while (rep != 1){
            
        
        for (int i = 0; i < 8; i++) {

            if (i < 3) {
                System.out.print("Enter "+captions[i]);
                ms[i] = input.nextLine();
            } else {
                System.out.print("Enter "+captions[i]);
                ms[i] = input.nextLine();
                obt = obt + Integer.parseInt(ms[i]);
            }

        }

        ms[8] = String.valueOf(obt);
        per = obt * 100 / 500;

        ms[9] = String.valueOf(per);

        if (per > 90) {
            grade = "A";
        } else if (per > 60) {
            grade = "B";
        } else if (per > 40) {
            grade = "C";
        } else {
            grade = "Fail";
        }

        ms[10] = grade;


        for (int i = 0; i < 11; i++) {
            System.out.println("-------------------------------------------------------------------------- \n" + captions[i]+" "+ms[i]);
        }

            System.out.println("Do you want to add more students ");
            String inp = input.nextLine();
            
        if(inp.equals("n")){
            rep = 1;
        }
        
        
        }
        
    }

}
