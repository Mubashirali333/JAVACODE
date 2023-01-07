
/**
 *
 * @author MR
 */
class Test {

    String id;
    String name;

    public void print() {
        System.out.println("Id is " + id);
        System.out.println("name is " + name);
    }

    Test(String id, String name) {
        this.id = id;
        this.name = name;
    }

}

public class NewTask2 {

    public static void main(String[] args) {

        Test t1 = new Test("Bsc74", "Mubashir");
        Test t2 = new Test("Bsc75", "ALi");
        t1.print();
        t2.print();

    }

}
