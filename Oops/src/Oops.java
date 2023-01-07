
class Pen {

    String color;
    String type;

    public void write() {
        System.out.println("Writing something ");
    }

    public void print() {
        System.out.println("color is " + this.color);
        System.out.println("Type is " + this.type);
    }
}

class Student {

    String name;
    int age;

    public void printname() {
        System.out.println("name is "+this.name);
        System.out.println("age is "+this.age);

    }
}

public class Oops {

    public static void main(String[] args) {

////        Object1
//        Pen pen1 = new Pen();
//        pen1.color = ("blue");
//        pen1.type = ("gel");
//        pen1.write();
//        pen1.print();
//        
////        Object2
//        Pen pen2 = new Pen();
//        pen2.color = "black";
//        pen2.type = "Fountain";
//        pen2.print();
        //student1
        Student s1 = new Student();
        s1.name = "ali";
        s1.age = 24;
        s1.printname();

//        Student2
        Student s2 = new Student();
        s2.name= "Siraj";
        s2.age = 26;
        s2.printname();

    }
}
