
/**
 *
 * @author MR
 */
class Student {

    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;

    }

    Student() {
        
    }

    public void printinfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

}

public class Oops5_Param_Constructor {

    public static void main(String[] args) {

        Student s1 = new Student("mr", 74);
        s1.printinfo();

    }

}
