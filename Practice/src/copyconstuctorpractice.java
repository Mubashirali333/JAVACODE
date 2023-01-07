
/**
 *
 * @author MR
 */
class student {

    String name;
    int age;

    public void printfun() {
        System.out.println(this.name);
        System.out.println(this.age);

    }

    student(student s2) {
        this.name = s2.name;
        this.age = s2.age;

    }

    student() {

    }

}

public class copyconstuctorpractice {

    public static void main(String[] args) {

        student s1 = new student();
        s1.name = "Ali";
        s1.age = 22;

        student s2 = new student(s1);
        s1.printfun();
    }

}
