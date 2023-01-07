/*
/**
 *
 * @author MR
 */
class student2 {

    String name;
    String fname;
    int roll;

    public void printfun() {
        System.out.println(this.name);
        System.out.println(this.fname);
        System.out.println(this.roll);
    }

    student2() {
//        System.out.println("Constructor called ");
        this.name = "ali";
        this.fname = "asli";

    }
}

public class Constructor_non_param {

    public static void main(String[] args) {
        student2 st1 = new student2();
//        st1.name = "mubashir";
//        st1.fname = "Rasheed";
//        st1.roll = 74;
        st1.printfun();
    }
}
