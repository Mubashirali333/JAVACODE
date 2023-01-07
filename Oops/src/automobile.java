/*
 */

/**
 *
 * @author MR
 */
class vehicle {

    String name;
    String color;

    public void printfun() {
        System.out.println("The name is "+this.name);
        System.out.println("The color is "+this.color);

    }
}

public class automobile {

    public static void main(String[] args) {
        vehicle car1 = new vehicle();
        car1.name = "mercedes";
        car1.color = "red";
        vehicle car2 = new vehicle();
        car2.name = "cororla";
        car2.color = "red";
        car1.printfun();
        car2.printfun();
    }

}
