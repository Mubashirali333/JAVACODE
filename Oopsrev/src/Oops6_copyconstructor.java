
/**
 *
 * @author MR
 */
class Studentt {

    String name;
    int age;

    public void printinfo() {
        System.out.println(name);
        System.out.println(age);
    }

}

public class Oops6_copyconstructor {

    public static void main(String[] args) {

        Studentt s1 = new Studentt();
        s1.name = "Mr";
        s1.age = 74;

        s1.printinfo();

    }

}
