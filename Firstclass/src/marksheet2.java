/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MR
 */
import java.util.Scanner;
public class marksheet2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ms[]= new String[11];
        
        int obt=0;
        float per = 0.0f;
        String grade = null;
        
        for(int i =0;i<8;i++)
        {
            
            if(i<3){
                System.out.println("Enter stid ");
                ms[i] = input.nextLine();
            }
            else {
                System.out.println("Enter marks :");
                ms[i]=input.nextLine();
                obt = obt+ Integer.parseInt(ms[i]);
            }
        
             
        
        
        }
        
        ms[8] = String.valueOf(obt);
        per = obt*100/500;        
        
        ms[9] = String.valueOf(per);
        
        if(per>90){
            grade = "A";
        }
        else if (per>60){
            grade = "B";
        }
        else if(per>40){
            grade = "C";
        }
        else{
            grade = "Fail";
        }
        
      String a = ms[10]=grade;
        System.out.println(""+a);
        
        
      for(int i=0;i<11;i++){  
        System.out.println(""+ms[i]);
      }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
