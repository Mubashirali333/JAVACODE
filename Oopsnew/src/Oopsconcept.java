
/**
 *
 * @author MR
 */
class student1 {

    String name;
    String fname;
    int roll;

    public void printfunc() {
                System.out.println("\t Details");
        System.out.println(this.name);
        System.out.println(this.fname);
        System.out.println(this.roll);

    }
}

public class Oopsconcept {

    public static void main(String[] args) {

        student1 st1 = new student1();
        st1.name = "Mubashir";
        st1.fname = "Rasheed";
        st1.roll = 74;

        student1 st2 = new student1();
        st2.name = "Ali";
        st2.fname = "Rasheed";
        st2.roll = 77;

        st1.printfunc();
        st2.printfunc();

    }

}
