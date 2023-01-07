
class student {

    String name;
    int roll;

    public void printfun(){
        System.out.println(this.name);
        System.out.println(this.roll);
    }
}

public class Main {

    public static void main(String[] args) {

        student st1 = new student();
        st1.name = "hamid";
        st1.roll = 78;
        st1.printfun();

    }
}
