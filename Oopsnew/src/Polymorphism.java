
class poly {

    public void func(int a) {
        System.out.println("First " + a + a);
    }

    public void func(int a, int b) {
        System.out.println("Second " + a * b);
    }

    public void func(String name) {
        System.out.println("Third " + name);

    }

}

public class Polymorphism {

    public static void main(String[] args) {
        poly obj = new poly();
        obj.func("ali");
        obj.func(2);
        obj.func(3,3);

    }
}
