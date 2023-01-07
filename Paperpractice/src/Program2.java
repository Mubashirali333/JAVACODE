
class Test {

    String name;
    int id;

    public void print() {
        System.out.println("Id is : " + id);
        System.out.println("Name is : " + name);
    }

    Test(int id, String name) {
        this.id = id;
        this.name = name;

    }

}

public class Program2 {

    public static void main(String[] args) {

        Test t1 = new Test(22, "dd");
        t1.print();
    }
}
