
/**
 *
 * @author MR
 */
class student3 {

    String name;
    int age;

    public void printfunc() {
        System.out.println(this.name);
        System.out.println(this.age);

    }

    student3(student3 s2) {
        this.name = s2.name;
        this.age = s2.age;
    }

    student3() {

    }

}

public class copyconstructorpractice {

    public static void main(String[] args) {
        student3 s1 = new student3();
        s1.name = "ali";
        s1.age = 22;

        student3 s2 = new student3(s1);
        s2.printfunc();
    }

}
