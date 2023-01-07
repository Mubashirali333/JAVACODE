
class student3 {

    String name;
    int age;

    student3(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public void printfun() {
        System.out.println(this.name);
        System.out.println(this.age);

    }

}

public class Constructor_param {

    public static void main(String[] args) {
        student3 st1 = new student3("ALi", 74);
        st1.printfun();
    }
}
