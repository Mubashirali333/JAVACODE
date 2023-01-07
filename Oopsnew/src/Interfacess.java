
/**
 *
 * @author MR
 */

//interfaces is full and final for all methods and inheritance and conot change or update


interface Animal {

    int eye = 2;

    public void walk();
}

class Horse implements Animal {

    public void walk() {
        System.out.println("Walk ");
    }

    public void eat() {
        System.out.println("eaat");
    }
}

public class Interfacess {

    public static void main(String[] args) {
        Horse horse = new Horse();
//        horse.eye = 4; // cant change                  
        System.out.println(horse.eye);
        horse.walk();
    }

}
