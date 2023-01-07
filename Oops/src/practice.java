/*
 * 
 */

/**
 *
 * @author MR
 */
class Student {

    String name;
    String uni;
    String dept;
    int roll;

    public void fun() {
        System.out.println(this.name);
        System.out.println(this.uni);
        System.out.println(this.dept);
        System.out.println(this.roll);
    }
}

public class practice {

    public static void main(String[] args) {

        Student st1 = new Student();
        st1.name = "Hamid";
        st1.uni = "GC";
        st1.dept = "IT";
        st1.roll = 78;

        st1.fun();

    }
}
