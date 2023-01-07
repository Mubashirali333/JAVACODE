/**
 *
 * @author Mubashir Ali
 */
import java.util.Random;
import java.util.Scanner;
public class Snakegame {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rm = new Random();
        String comp = null, you;
        int randno = rm.nextInt(1, 4);
//        System.out.println(" "+a);

        if (randno == 1) {
            comp = "w";
        } else if (randno == 2) {
            comp = "s";
        } else if (randno == 3) {
            comp = "g";
        }
        
        System.out.println("Enter Snake(s),Water(w),Gun(g) :");
        you = input.nextLine();
        ///////////////////////////////////////
        if (comp.equals(you)) {
            System.out.println("Tie");}
            
        ////////////////////////////////////////
            
        else if (comp.equals("w")) {
            if (you.equals("g")) {
                System.out.println("You lose ");
            }
            else if(you.equals("s")){
                System.out.println("You Win ");
            }
        }
        ///////////////////////////////////////
        
        else if (comp.equals("s")){
            if(you.equals("g")){
                System.out.println("You Win ");
            }
            else if(you.equals("w")){
                System.out.println("You Lose ");
            }
        }
        
        //////////////////////////////////////////
        
        else if(comp.equals("g")){
            if(you.equals("s")){
                System.out.println("You lose ");
            }
            else if(you.equals("w")){
                System.out.println("You Win ");
            }
        }
        
        /////////////////////////////////////////////
        
        if("w".equals(comp)){
            System.out.println("Computer choose Water ");
        }
        else if("s".equals(comp)){
            System.out.println("Computer choose Snake ");
        }
        else if("g".equals(comp)){
            System.out.println("Computer choose Gun");
        }
        ///////////////////////////////////////////////
        
        if("w".equals(you)){
            System.out.println("You choose Water ");
        }
        else if("s".equals(you)){
            System.out.println("You choose Snake ");
        }
        else if("g".equals(you)){
            System.out.println("You choose Gun");
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    }

}
