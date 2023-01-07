
/**
 *
 * @author MR
 */
class New {

    String name;
    int a, b;

    public void printinfo(int a) {
        System.out.println("Square is " + this.a * this.a);
    }

    public void printinfo(int a, int b) {
        System.out.println("Rectangle is " + this.a * this.b);
    }

    public void printinfo(String name) {
        System.out.println("Name is " + name);
    }

}

public class Polymorphism {

    public static void main(String[] args) {
        New n1 = new New();
        n1.name = "MR";
        n1.a = 5;
        n1.b = 10;
        n1.printinfo(n1.a);
    }

}
