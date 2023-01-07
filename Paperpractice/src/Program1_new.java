
/**
 *
 * @author MR
 */
class Test {

    String name;
    String surname;

//    void getdata(String name, String surname) {
//        this.name = name;
//        this.surname = surname;
//    }
    void print() {
        System.out.println("" + name);
        System.out.println("" + surname);

    }

    Test(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

}

public class Program1_new {

    public static void main(String[] args) {
        Test t1 = new Test("ali", "shaikh");
        Test t2 = new Test("Yousuf", "Ali");
        t1.print();
    }

}
