
/**
 *
 * @author MR
 */
import java.util.Random;
import java.util.Scanner;

class New {
        Scanner input = new Scanner(System.in);

    public void game(String comp, String you) {
        if (!"w".equals(you) & !"s".equals(you) & !"g".equals(you)) {
            System.out.println("Wrong input ");
        }
        if (comp.equals(you)) {
            System.out.println("This is tie ");
        } else if ("w".equals(comp)) {
            if ("s".equals(you)) {
                System.out.println("You Win ");
            } else if ("g".equals(you)) {
                System.out.println("You lose ");
            }
        } ///////////////////////////////////////
        else if ("g".equals(comp)) {
            if ("w".equals(you)) {
                System.out.println("You Win ");
            } else if ("s".equals(you)) {
                System.out.println("You lose ");
            }
        } else if ("s".equals(comp)) {
            if ("w".equals(you)) {
                System.out.println("You lose ");
            } else if ("g".equals(you)) {
                System.out.println("You Win ");
            }
        }

        Random r1 = new Random();
        int randno = r1.nextInt(1, 4);
        if (randno == 1) {
            comp = "s";
        } else if (randno == 2) {
            comp = "w";
        } else if (randno == 3) {
            comp = "g";
        }
        you = input.nextLine();

    }

}

public class Snake_Water_Gun_game {

    public static void main(String[] args) {

        New obj = new New();
//        obj.game(comp, you);
//        obj.game(randno,"w");
    }

}
