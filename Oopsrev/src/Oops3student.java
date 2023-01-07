
/**
 *
 * @author MR
 */
class Students {

    String name;
    int age;
    int roll;

    public void printfunc() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.roll);
        System.out.println("----------------------------------------------------");
    }

}

public class Oops3student {

    public static void main(String[] args) {

        Students s1 = new Students();
        s1.name = "Ali";
        s1.age = 20;
        s1.roll = 75;

        Students s2 = new Students();
        s2.name = "Mubashir";
        s2.age = 21;
        s2.roll = 74;

        s1.printfunc();
        s2.printfunc();

    }

}
