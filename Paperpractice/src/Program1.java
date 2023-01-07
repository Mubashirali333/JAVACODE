
// 1. Write a program to create a class Student along with two methods getData(),printData() to get the 
//value through argument and display the data in printData. Create the two objects s1 ,s2 to declare and 
//access the values from class STtest
/**
 *
 * @author MR
 */
class STtest {

    String name;
    String fname;

    void getdata(String name, String fname) {
        this.name = name;
        this.fname = fname;
    }

    void print() {
        System.out.println("name is " + name);
        System.out.println("" + fname);
    }
}

public class Program1 {

    public static void main(String[] args) {

        STtest s1 = new STtest();
        s1.getdata("ala", "ksk");
        STtest s2 = new STtest();
        s2.getdata("sn", ",sns,");
        s1.print();
        s2.print();
    }
}
